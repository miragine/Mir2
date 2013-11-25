/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.beans.profession;

import java.util.Collections;
import java.util.List;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.PersistenceCapable;

import mir2.common.utils.RandomNumberUtils;
import mir2.core.fight.beans.AssaultPhysical;
import mir2.core.fight.beans.Hp;
import mir2.core.fight.pool.FighterMessage;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.fight.pool.PlayerFighterUnit;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.props.beans.Equipment;

/**
 * 战士
 */
@PersistenceCapable
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Warrior extends PersonAttribute {

	public FighterUnit getFighterUnit(List<Equipment> equipments) {
		return new WarriorFighter(this, equipments);
	}

	class WarriorFighter implements FighterUnit {
		
		private Warrior warrior;
		
		private List<Equipment> equipments;

		public WarriorFighter(Warrior warrior, List<Equipment> equipments) {
			this.warrior = warrior;
			this.equipments = equipments;
			
			
			
		};

		@Override
		public List<FighterMessage> active(FighterUnit passive) {
			int assault = RandomNumberUtils.nextInt(warrior.assaultPhysical.getMin(), assaultPhysical.getMax());
			int shield = passive.getShieldPhysical().getValue();
			int injure = assault - (shield / 10);
			
			FighterMessage message = new FighterMessage();
			if (injure > 0) {
				
			} else {
				
			}
			
			return Collections.singletonList(message);
		}

		@Override
		public Long getId() {
			return warrior.getId();
		}

		@Override
		public int doAssaultPhysical(int assault) {
			return 0;
		}

		@Override
		public int doAssaultMagic(int assault) {
			return 0;
		}

	}

}