/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.beans;


/**
 * 
 * HP
 */
public class Hp extends FightAttributeFixed {

	public Hp() {
		super();
	}

	public Hp(int value) {
		super(value);
	}

	/**
	 * 去血
	 * 
	 * @param value
	 */
	public synchronized void reduce(int value) {
		this.value -= value;
		if (this.value < 0) {
			this.value = 0;
		}
	}

}
