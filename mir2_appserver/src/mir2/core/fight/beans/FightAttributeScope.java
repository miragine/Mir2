/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.beans;

/**
 * 
 */
public abstract class FightAttributeScope extends FightAttribute {
	
	/**
	 * 下线
	 */
	protected int minValue;
	
	/**
	 * 上线
	 */
	protected int maxValue;

	/**
	 * @return the minValue
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * @param minValue the minValue to set
	 */
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	/**
	 * @return the maxValue
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * @param maxValue the maxValue to set
	 */
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

}