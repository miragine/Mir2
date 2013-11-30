/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

import java.util.List;

/**
 * 战斗过程
 * <p>
 * 一场战斗，由2个以上的战斗单位组成
 * <p>
 * 从该对象不断获取战斗消息
 */
public interface FighterSpider {

	/**
	 * 该方法被阻塞
	 * 
	 * @return
	 */
	public FighterMessage poll();

	/**
	 * 写入战斗信息
	 * 
	 * @param messages
	 */
	public void offer(List<FighterMessage> messages);

	/**
	 * 一场战斗唯一ID
	 * 
	 * @return
	 */
	public long getFighterId();

}
