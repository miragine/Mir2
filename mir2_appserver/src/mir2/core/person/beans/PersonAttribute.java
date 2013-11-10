/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.beans;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.PersistenceCapable;

import mir2.common.db.JdoEntityImpl;
import mir2.core.fight.beans.AssaultCrit;
import mir2.core.fight.beans.AssaultMagic;
import mir2.core.fight.beans.AssaultPhysical;
import mir2.core.fight.beans.Dodge;
import mir2.core.fight.beans.Hp;
import mir2.core.fight.beans.HpRecovery;
import mir2.core.fight.beans.ShieldMagic;
import mir2.core.fight.beans.ShieldPhysical;


/**
 * 人物属性
 */
@PersistenceCapable(detachable = "true")
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class PersonAttribute extends JdoEntityImpl {
	
	/**
	 * 等级
	 */
	protected int level;
	
	/**
	 * 物攻
	 */
	protected AssaultPhysical assaultPhysical;
	
	/**
	 * 魔攻
	 */
	protected AssaultMagic assaultMagic;
	
	/**
	 * HP
	 */
	protected Hp hp;
	
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
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the assaultPhysical
	 */
	public AssaultPhysical getAssaultPhysical() {
		return assaultPhysical;
	}

	/**
	 * @param assaultPhysical the assaultPhysical to set
	 */
	public void setAssaultPhysical(AssaultPhysical assaultPhysical) {
		this.assaultPhysical = assaultPhysical;
	}

	/**
	 * @return the assaultMagic
	 */
	public AssaultMagic getAssaultMagic() {
		return assaultMagic;
	}

	/**
	 * @param assaultMagic the assaultMagic to set
	 */
	public void setAssaultMagic(AssaultMagic assaultMagic) {
		this.assaultMagic = assaultMagic;
	}

	/**
	 * @return the hp
	 */
	public Hp getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(Hp hp) {
		this.hp = hp;
	}

	/**
	 * @return the shieldPhysical
	 */
	public ShieldPhysical getShieldPhysical() {
		return shieldPhysical;
	}

	/**
	 * @param shieldPhysical the shieldPhysical to set
	 */
	public void setShieldPhysical(ShieldPhysical shieldPhysical) {
		this.shieldPhysical = shieldPhysical;
	}

	/**
	 * @return the shieldMagic
	 */
	public ShieldMagic getShieldMagic() {
		return shieldMagic;
	}

	/**
	 * @param shieldMagic the shieldMagic to set
	 */
	public void setShieldMagic(ShieldMagic shieldMagic) {
		this.shieldMagic = shieldMagic;
	}

	/**
	 * @return the hpRecovery
	 */
	public HpRecovery getHpRecovery() {
		return hpRecovery;
	}

	/**
	 * @param hpRecovery the hpRecovery to set
	 */
	public void setHpRecovery(HpRecovery hpRecovery) {
		this.hpRecovery = hpRecovery;
	}

	/**
	 * @return the dodge
	 */
	public Dodge getDodge() {
		return dodge;
	}

	/**
	 * @param dodge the dodge to set
	 */
	public void setDodge(Dodge dodge) {
		this.dodge = dodge;
	}

	/**
	 * @return the assaultCrit
	 */
	public AssaultCrit getAssaultCrit() {
		return assaultCrit;
	}

	/**
	 * @param assaultCrit the assaultCrit to set
	 */
	public void setAssaultCrit(AssaultCrit assaultCrit) {
		this.assaultCrit = assaultCrit;
	}

}