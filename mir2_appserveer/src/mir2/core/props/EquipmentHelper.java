/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.props;

import java.util.List;

import mir2.core.fight.beans.AssaultCrit;
import mir2.core.fight.beans.AssaultMagic;
import mir2.core.fight.beans.AssaultPhysical;
import mir2.core.fight.beans.Dodge;
import mir2.core.fight.beans.FightAttribute;
import mir2.core.fight.beans.FightAttributes;
import mir2.core.fight.beans.HpRecovery;
import mir2.core.fight.beans.ShieldMagic;
import mir2.core.fight.beans.ShieldPhysical;
import mir2.core.props.beans.Equipment;

/**
 * 
 */
public class EquipmentHelper {

	public static FightAttributes getFightAttributes(List<Equipment> equipments) {
		FightAttributes fightAttributes = new FightAttributes();
		for (Equipment equipment : equipments) {
			List<FightAttribute> attrs = equipment.getAttributes();
			for (FightAttribute attr : attrs) {
				if (attr instanceof AssaultPhysical) { // 物攻
					AssaultPhysical temp = (AssaultPhysical) attr;
					fightAttributes.getAssaultPhysical().addValue(
							temp.getMin(), temp.getMax());
				} else if (attr instanceof AssaultMagic) { // 魔攻
					AssaultMagic temp = (AssaultMagic) attr;
					fightAttributes.getAssaultMagic().addValue(temp.getMin(),
							temp.getMax());
				} else if (attr instanceof ShieldPhysical) { // 物防
					ShieldPhysical temp = (ShieldPhysical) attr;
					fightAttributes.getShieldPhysical().addValue(
							temp.getValue());
				} else if (attr instanceof ShieldMagic) { // 魔防
					ShieldMagic temp = (ShieldMagic) attr;
					fightAttributes.getShieldMagic().addValue(temp.getValue());
				} else if (attr instanceof HpRecovery) { // 生命回复
					HpRecovery temp = (HpRecovery) attr;
					fightAttributes.getHpRecovery().addValue(temp.getValue());
				} else if (attr instanceof Dodge) { // 闪避
					Dodge temp = (Dodge) attr;
					fightAttributes.getDodge().addValue(temp.getValue());
				} else if (attr instanceof AssaultCrit) { // 暴击
					AssaultCrit temp = (AssaultCrit) attr;
					fightAttributes.getAssaultCrit().addValue(temp.getValue());
				}
			}
		}

		return fightAttributes;
	}

}
