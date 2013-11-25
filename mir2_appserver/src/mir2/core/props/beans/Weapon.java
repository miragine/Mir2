/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.props.beans;

import mir2.core.fight.beans.Assault;

/**
 * 武器
 */
public class Weapon extends Equipment {
	
	/**
	 * 攻击力
	 */
	private Assault assault;

	/**
	 * @return the assault
	 */
	public Assault getAssault() {
		return assault;
	}

	/**
	 * @param assault the assault to set
	 */
	public void setAssault(Assault assault) {
		this.assault = assault;
	}

}
