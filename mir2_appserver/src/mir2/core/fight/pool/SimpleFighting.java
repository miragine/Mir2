/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.webjvm.core.utils.BackgroundHelper;

/**
 * 
 */
@Service
public class SimpleFighting implements Fighting {

	private static long FIGHT_INTERVAL = 2000;

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
		BackgroundHelper.scheduleTaskWithFixedDelay(taskB, 1000,
				FIGHT_INTERVAL, TimeUnit.MILLISECONDS);

		return fighterSpider;
	}

	private class FightingTask implements Runnable {

		private FighterSpider fighterSpider;

		private FighterUnit active;

		private FighterUnit passive;

		private FightingTask(FighterSpider fighterSpider, FighterUnit active,
				FighterUnit passive) {
			this.fighterSpider = fighterSpider;
			this.active = active;
			this.passive = passive;
		}

		@Override
		public void run() {

			// TODO

		}

	}

	private class SimpleFighterSpider implements FighterSpider {

		private Queue<FighterMessage> queue;

		private long id;

		private SimpleFighterSpider(long id) {
			this.id = id;
			queue = new LinkedBlockingQueue<FighterMessage>();
		}

		private void add(FighterMessage message) {
			queue.add(message);
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
