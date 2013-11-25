/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.beans;

/**
 * 
 */
public abstract class FightAttributeFixed extends FightAttribute {
	
	/**
	 * 值
	 */
	protected int value;

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public synchronized void addValue(int value) {
		this.value = value;
	}
	
	public FightAttributeFixed() {
		this.value = 0;
	}
	
	public FightAttributeFixed(int value) {
		this.value = value;
	}

}