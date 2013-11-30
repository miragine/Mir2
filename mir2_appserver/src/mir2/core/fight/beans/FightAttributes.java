/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.beans;

/**
 * 
 */
public class FightAttributes {

	/**
	 * 物攻
	 */
	protected AssaultPhysical assaultPhysical;

	/**
	 * 魔攻
	 */
	protected AssaultMagic assaultMagic;

	/**
	 * 物防
	 */
	protected ShieldPhysical shieldPhysical;

	/**
	 * 魔防
	 */
	protected ShieldMagic shieldMagic;

	/**
	 * 生命回复
	 */
	protected HpRecovery hpRecovery;

	/**
	 * 闪避
	 */
	protected Dodge dodge;

	/**
	 * 暴击
	 */
	protected AssaultCrit assaultCrit;

	/**
	 * @return the assaultPhysical
	 */
	public AssaultPhysical getAssaultPhysical() {
		return assaultPhysical;
	}

	/**
	 * @return the assaultMagic
	 */
	public AssaultMagic getAssaultMagic() {
		return assaultMagic;
	}

	/**
	 * @return the shieldPhysical
	 */
	public ShieldPhysical getShieldPhysical() {
		return shieldPhysical;
	}

	/**
	 * @return the shieldMagic
	 */
	public ShieldMagic getShieldMagic() {
		return shieldMagic;
	}

	/**
	 * @return the hpRecovery
	 */
	public HpRecovery getHpRecovery() {
		return hpRecovery;
	}

	/**
	 * @return the dodge
	 */
	public Dodge getDodge() {
		return dodge;
	}

	/**
	 * @return the assaultCrit
	 */
	public AssaultCrit getAssaultCrit() {
		return assaultCrit;
	}

	public FightAttributes() {
		assaultPhysical = new AssaultPhysical();
		assaultMagic = new AssaultMagic();
		shieldPhysical = new ShieldPhysical();
		shieldMagic = new ShieldMagic();
		hpRecovery = new HpRecovery();
		dodge = new Dodge();
		assaultCrit = new AssaultCrit();
	}

}
