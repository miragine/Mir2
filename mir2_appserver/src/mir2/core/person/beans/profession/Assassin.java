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
import mir2.core.fight.pool.FighterMessage;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.props.beans.Equipment;
import mir2.core.props.beans.Weapon;

/**
 * 刺客
 */
@PersistenceCapable
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Assassin extends PersonAttribute {

	@Override
	public FighterUnit getFighterUnit(Long id, List<Equipment> equipments) {
		return new AssassinFighter(id, this, equipments);
	}

	private class AssassinFighter implements FighterUnit {
		
		private Long id;

		private Assassin assassin;

		private List<Equipment> equipments;
		
		private AssaultPhysical assaultPhysical;
		
		private 

		public AssassinFighter(Long id, Assassin assassin, List<Equipment> equipments) {
			this.id = id;
			this.assassin = assassin;
			this.equipments = equipments;
			initAttribute(equipments);
		}
		
		private void initAttribute(List<Equipment> equipments) {
			int assaultMin = 0;
			int assaultMax = 0;
			for(Equipment equipment : equipments) {
				if (equipment instanceof Weapon) {
					assaultMin += ((Weapon) equipment).getAssault().getMin();
					assaultMax += ((Weapon) equipment).getAssault().getMax();
				}
			}
			
			assaultPhysical = new AssaultPhysical(assaultMin, assaultMax);
		}
		
		@Override
		public Long getId() {
			return id;
		}

		@Override
		public List<FighterMessage> active(FighterUnit passive) {
			
		}

		@Override
		public int doAssaultPhysical(int assault) {
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

}