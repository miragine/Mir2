/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.enums;

import java.util.NoSuchElementException;

import mir2.core.person.beans.PersonAttribute;
import mir2.core.person.beans.profession.Assassin;
import mir2.core.person.beans.profession.Magician;
import mir2.core.person.beans.profession.Taoist;
import mir2.core.person.beans.profession.Warrior;

/**
 * 
 */
public enum ProfessionInitData {

	/**
	 * 刺客
	 */
	ASSASSIN(Assassin.class, 45, 9),

	/**
	 * 魔法师
	 */
	MAGICIAN(Magician.class, 45, 8),

	/**
	 * 道士
	 */
	TAOIST(Taoist.class, 45, 12),

	/**
	 * 战士
	 */
	WARRIOR(Warrior.class, 45, 18);

	private int initHp;

	private int ratioHp;

	private Class<? extends PersonAttribute> clazz;

	private ProfessionInitData(Class<? extends PersonAttribute> clazz,
			int initHp, int ratioHp) {
		this.clazz = clazz;
		this.initHp = initHp;
		this.ratioHp = ratioHp;
	}

	public int getHp(int level) {
		return initHp + ratioHp * level;
	}

	public Class<? extends PersonAttribute> getClassType() {
		return this.clazz;
	}

	public static ProfessionInitData valueOfType(String typeValue) {
		String type = typeValue.toUpperCase();
		if (type.equals(ASSASSIN.name())) {
			return ASSASSIN;
		} else if (type.equals(TAOIST.name())) {
			return TAOIST;
		} else if (type.equals(MAGICIAN.name())) {
			return MAGICIAN;
		} else if (type.equals(WARRIOR.name())) {
			return WARRIOR;
		} else {
			throw new NoSuchElementException();
		}
	}

}
