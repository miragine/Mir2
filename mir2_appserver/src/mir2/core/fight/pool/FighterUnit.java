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
	 * 攻击一次，返回攻击
	 * 
	 * @param passiver
	 * @return
	 */
	public List<FighterMessage> active(FighterUnit passiver);

	/**
	 * 物理功击
	 * 
	 * @param assault
	 * @return 所产生的伤害
	 */
	public int doAssaultPhysical(int assault);

	/**
	 * 魔法攻击
	 * 
	 * @param assault
	 * @return 所产生的伤害
	 */
	public int doAssaultMagic(int assault);

}
