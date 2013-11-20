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
	protected int min;
	
	/**
	 * 上线
	 */
	protected int max;

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	
	public FightAttributeScope(int min, int max) {
		this.min = min;
		this.max = max;
	}

}