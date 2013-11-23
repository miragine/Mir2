/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.common.utils;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 随机数方法
 * <p>
 * 该方法保证线程安全，优化随机数生成算法
 */
public class RandomNumberUtils {

	private static BlockingQueue<Random> randomQueue;

	{
		randomQueue = new LinkedBlockingQueue<Random>();
		for (int i = 0; i < 1000; i++) {
			randomQueue.add(new Random(i));
		}
	}

	/**
	 * 生成区间内随机数
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int nextInt(int min, int max) {
		Random random = randomQueue.poll();
		int result = random.nextInt(max - min) + min;
		randomQueue.add(random);
		return result;
	}
}
