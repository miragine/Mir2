/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.people.beans;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

/**
 * 人物属性
 */
@Embeddable
@Access(AccessType.PROPERTY)
public class PeopleAttribute {

	/**
	 * 物攻
	 */
	protected int physicalAssaultMin;

	protected int physicalAssaultMax;

	/**
	 * 魔攻
	 */
	protected int magicAssaultMin;

	protected int magicAssaultMax;

	/**
	 * 物防
	 */
	protected int physicalShieldValue;

	/**
	 * 魔防
	 */
	protected int magicShieldValue;

	public int getPhysicalAssaultMin() {
		return physicalAssaultMin;
	}

	public void setPhysicalAssaultMin(int physicalAssaultMin) {
		this.physicalAssaultMin = physicalAssaultMin;
	}

	public int getPhysicalAssaultMax() {
		return physicalAssaultMax;
	}

	public void setPhysicalAssaultMax(int physicalAssaultMax) {
		this.physicalAssaultMax = physicalAssaultMax;
	}

	public int getMagicAssaultMin() {
		return magicAssaultMin;
	}

	public void setMagicAssaultMin(int magicAssaultMin) {
		this.magicAssaultMin = magicAssaultMin;
	}

	public int getMagicAssaultMax() {
		return magicAssaultMax;
	}

	public void setMagicAssaultMax(int magicAssaultMax) {
		this.magicAssaultMax = magicAssaultMax;
	}

	public int getPhysicalShieldValue() {
		return physicalShieldValue;
	}

	public void setPhysicalShieldValue(int physicalShieldValue) {
		this.physicalShieldValue = physicalShieldValue;
	}

	public int getMagicShieldValue() {
		return magicShieldValue;
	}

	public void setMagicShieldValue(int magicShieldValue) {
		this.magicShieldValue = magicShieldValue;
	}

}