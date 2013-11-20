/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

/**
 * 战斗过程
 * 
 * 从该对象不断获取战斗消息
 */
public interface FighterSpider {
	
	/**
	 * 该方法有可能被阻塞
	 * 
	 * @return
	 */
	public FighterMessage poll();
	
	/**
	 * 战斗ID
	 * 
	 * @return
	 */
	public long getFighterId();

}
