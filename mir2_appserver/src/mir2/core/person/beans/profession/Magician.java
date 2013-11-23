/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.beans.profession;

import java.util.List;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.PersistenceCapable;

import mir2.core.fight.pool.FighterUnit;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.props.beans.Equipment;

/**
 * 魔法师
 */
@PersistenceCapable
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Magician extends PersonAttribute {

	public FighterUnit getFighterUnit(List<Equipment> equipments) {
		return new MagicianFighter(equipments);
	}

	class MagicianFighter extends FighterUnit {

		public MagicianFighter(List<Equipment> equipments) {
		};

		@Override
		public void active(FighterUnit passive) {

		}

	}

}