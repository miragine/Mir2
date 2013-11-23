/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.beans.profession;

import java.util.List;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.PersistenceCapable;

import mir2.core.fight.beans.AssaultPhysical;
import mir2.core.fight.beans.Hp;
import mir2.core.fight.pool.FighterMessage;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.props.beans.Equipment;

/**
 * 刺客
 */
@PersistenceCapable
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Assassin extends PersonAttribute {

	@Override
	public FighterUnit getFighterUnit(List<Equipment> equipments) {
		return new AssassinFighter(this, equipments);
	}

	class AssassinFighter extends FighterUnit {

		private Assassin assassin;

		private List<Equipment> equipments;

		public AssassinFighter(Assassin assassin, List<Equipment> equipments) {
			this.level = assassin.level;
			this.hp = new Hp(assassin.hpValue);
			this.assaultPhysical = new AssaultPhysical(level * 5, level * 10);
		}

		@Override
		public List<FighterMessage> active(FighterUnit passive) {
			
		}

	}

}