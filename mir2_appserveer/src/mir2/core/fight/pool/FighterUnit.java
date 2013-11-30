/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

import java.util.List;

import mir2.core.props.beans.Equipment;

/**
 * 战斗单位
 */
public interface FighterUnit {
	
	/**
	 * 物理攻击减免系数
	 */
	public static final int ABSOLVE_PHYSICAL_HURT = 50;
	
	/**
	 * 魔法攻击减免系数
	 */
	public static final int ABSOLVE_MAGIC_HURT = 5;
	
	/**
	 * 准备战斗，初始化血量、攻击力等
	 * 
	 * @param equipments
	 */
	public List<FighterMessage> prepareFighting(List<Equipment> equipments);
	
	/**
	 * 重置战斗状态，返回恢复血量等消息
	 */
	public List<FighterMessage> restFighting();

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
