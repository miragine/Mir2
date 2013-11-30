/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.people.beans;

import java.util.List;

import javax.persistence.Entity;

import mir2.core.fight.pool.FighterMessage;
import mir2.core.fight.pool.FighterUnit;

/**
 * 魔法师
 */
@Entity
public class Magician extends Fighter {

	/* (non-Javadoc)
	 * @see mir2.core.fight.pool.FighterUnit#active(mir2.core.fight.pool.FighterUnit)
	 */
	@Override
	public List<FighterMessage> active(FighterUnit passiver) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see mir2.core.fight.pool.FighterUnit#doAssaultPhysical(int)
	 */
	@Override
	public int doAssaultPhysical(int assault) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see mir2.core.fight.pool.FighterUnit#doAssaultMagic(int)
	 */
	@Override
	public int doAssaultMagic(int assault) {
		// TODO Auto-generated method stub
		return 0;
	}

}