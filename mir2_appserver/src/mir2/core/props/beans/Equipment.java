/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.props.beans;

/**
 * 装备
 */
public class Equipment extends Goods {

	/**
	 * 装备等级
	 */
	private int level;

	/**
	 * 等级限制
	 */
	private int levlePlace;
	
	/**
	 * 持久度
	 */
	private long durable;

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
	 * @return the levlePlace
	 */
	public int getLevlePlace() {
		return levlePlace;
	}

	/**
	 * @param levlePlace
	 *            the levlePlace to set
	 */
	public void setLevlePlace(int levlePlace) {
		this.levlePlace = levlePlace;
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

}
