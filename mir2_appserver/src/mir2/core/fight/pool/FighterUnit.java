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
	 * 攻击一次，返回攻击
	 * 
	 * @param passive
	 * @return
	 */
	public List<FighterMessage> active(FighterUnit passive);

}
