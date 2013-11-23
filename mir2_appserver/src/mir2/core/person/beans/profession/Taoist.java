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
 * 道士
 */
@PersistenceCapable
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Taoist extends PersonAttribute {
	
	public FighterUnit getFighterUnit(List<Equipment> equipments) {
		return new TaoistFighter(equipments);
	}

	class TaoistFighter extends FighterUnit {

		public TaoistFighter(List<Equipment> equipments) {
		};

		@Override
		public void active(FighterUnit passive) {
			
		}

	}

}