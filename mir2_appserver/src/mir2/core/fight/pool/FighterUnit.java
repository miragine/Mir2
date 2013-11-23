/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

import java.util.List;


/**
 * 战斗单位
 */
public interface FighterUnit {
	
	/**
	 * 战斗单位ID
	 * 
	 * @return
	 */
	public Long getId();
	
	/**
	 * 行动
	 * 
	 * @param target
	 * @return
	 */
	public List<FighterMessage> doAction(FighterUnit target);
	
	/**
	 * 
	 * @param target
	 * @return
	 */
	public int assault(FighterUnit target);
	
	/**
	 * 攻击一次，返回攻击
	 * 
	 * @param passive
	 * @return
	 */
	public int doActive(FighterUnit passive);
	
	public int doPassive(FighterUnit active);

}
