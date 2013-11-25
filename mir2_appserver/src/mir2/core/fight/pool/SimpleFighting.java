/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.webjvm.core.utils.BackgroundHelper;

/**
 * 简单战斗实现
 */
@Service
public class SimpleFighting implements Fighting {

	private static long FIGHT_INTERVAL = 2000L;

	private static long FIGHT_START = 1000L;

	/**
	 * 战斗ID生成器
	 */
	private AtomicLong idGenerate;

	public SimpleFighting() {
		idGenerate = new AtomicLong(0L);
	}

	@Override
	public FighterSpider singled(FighterUnit active, FighterUnit passive) {
		final SimpleFighterSpider fighterSpider = new SimpleFighterSpider(
				idGenerate.incrementAndGet());

		// 主动攻击
		FightingTask taskA = new FightingTask(fighterSpider, active, passive);
		// 被攻击
		FightingTask taskB = new FightingTask(fighterSpider, passive, active);

		BackgroundHelper.scheduleTask(taskA, FIGHT_INTERVAL,
				TimeUnit.MILLISECONDS);
		BackgroundHelper.scheduleTaskWithFixedDelay(taskB, FIGHT_START,
				FIGHT_INTERVAL, TimeUnit.MILLISECONDS);

		return fighterSpider;
	}

	/**
	 * 战斗
	 */
	private class FightingTask implements Runnable {

		private FighterSpider fighterSpider;

		private FighterUnit activer;

		private FighterUnit passiver;

		private FightingTask(FighterSpider fighterSpider, FighterUnit activer,
				FighterUnit passiver) {
			this.fighterSpider = fighterSpider;
			this.activer = activer;
			this.passiver = passiver;
		}

		@Override
		public void run() {
			List<FighterMessage> messages = activer.active(passiver);
			fighterSpider.offer(messages);
		}

	}

	private class SimpleFighterSpider implements FighterSpider {

		private Queue<FighterMessage> queue;

		private long id;

		private SimpleFighterSpider(long id) {
			this.id = id;
			queue = new LinkedBlockingQueue<FighterMessage>();
		}

		public void offer(List<FighterMessage> messages) {
			queue.addAll(messages);
		}

		@Override
		public FighterMessage poll() {
			return queue.poll();
		}

		@Override
		public long getFighterId() {
			return id;
		}

	}

}
