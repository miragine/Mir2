/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.props.beans;

import java.util.List;

import mir2.core.fight.beans.FightAttribute;

/**
 * 装备
 */
public class Equipment extends Goods {

	/**
	 * 装备等级
	 */
	private int level;

	/**
	 * 装备该物品的最小等级
	 */
	private int levelMin;
	
	/**
	 * 持久度
	 */
	private long durable;
	
	/**
	 * 装备属性
	 */
	private List<FightAttribute> attributes;

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the levelMin
	 */
	public int getLevelMin() {
		return levelMin;
	}

	/**
	 * @param levelMin the levelMin to set
	 */
	public void setLevelMin(int levelMin) {
		this.levelMin = levelMin;
	}

	/**
	 * @return the durable
	 */
	public long getDurable() {
		return durable;
	}

	/**
	 * @param durable the durable to set
	 */
	public void setDurable(long durable) {
		this.durable = durable;
	}

	/**
	 * @return the attributes
	 */
	public List<FightAttribute> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<FightAttribute> attributes) {
		this.attributes = attributes;
	}

}
