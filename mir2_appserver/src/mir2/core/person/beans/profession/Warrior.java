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
import mir2.core.fight.beans.FightAttributes;
import mir2.core.fight.beans.Hp;
import mir2.core.fight.enums.SkillType;
import mir2.core.fight.pool.FighterMessage;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.props.EquipmentHelper;
import mir2.core.props.beans.Equipment;

/**
 * 战士
 */
@PersistenceCapable
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Warrior extends PersonAttribute {

	@Override
	public FighterUnit getFighterUnit(Long id, String name,
			List<Equipment> equipments) {
		return new WarriorFighter(id, name, this, equipments);
	}

	class WarriorFighter implements FighterUnit {

		private Long id;

		private String name;

		private Warrior warrior;

		private List<Equipment> equipments;

		private FightAttributes attrs;

		/**
		 * 血量
		 */
		private Hp hp;

		/**
		 * 等级
		 */
		private int level;

		public WarriorFighter(Long id, String name, Warrior warrior,
				List<Equipment> equipments) {
			this.id = id;
			this.name = name;
			this.warrior = warrior;
			this.equipments = equipments;
			initAttribute();
		};

		private void initAttribute() {
			hp = new Hp(warrior.hpValue);
			attrs = EquipmentHelper.getFightAttributes(equipments);
		}

		@Override
		public Long getId() {
			return id;
		}

		@Override
		public List<FighterMessage> active(FighterUnit passive) {
			int assault = RandomNumberUtils.nextInt(attrs.getAssaultPhysical()
					.getMin(), attrs.getAssaultPhysical().getMax());
			int hurt = passive.doAssaultPhysical(assault);

			FighterMessage message = new FighterMessage(this, passive,
					SkillType.ASSAULT_PHYSICAL, hurt);
			return Collections.singletonList(message);
		}

		@Override
		public int doAssaultPhysical(int assault) {
			float shield = attrs.getShieldPhysical().getValue();
			float absolve = shield / (shield + level * ABSOLVE_PHYSICAL_HURT);
			int hurt = (int) (assault * absolve);
			this.hp.reduce(hurt);
			return hurt;
		}

		@Override
		public int doAssaultMagic(int assault) {
			float shield = attrs.getShieldMagic().getValue();
			float absolve = shield / (shield + level * ABSOLVE_MAGIC_HURT);
			int hurt = (int) (assault * absolve);
			this.hp.reduce(hurt);
			return hurt;
		}

		@Override
		public String getName() {
			return name;
		}

	}

}