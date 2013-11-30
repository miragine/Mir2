/**
 * Copyright (c) mir2.miragine.com 2014.<br>
 * 
 * Created on 2013年11月30日
 * @author <a href="mailto:zoday@webjvm.com">zoday</a>
 * @version $Revision: 1.0$
 */
package mir2.core.people.beans;

import java.util.Collections;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import mir2.common.db.JpaEntityImpl;
import mir2.core.fight.beans.FightAttributes;
import mir2.core.fight.beans.Hp;
import mir2.core.fight.pool.FighterMessage;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.props.EquipmentHelper;
import mir2.core.props.beans.Equipment;

/**
 * 战斗者
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "TB_FIGHTER")
public abstract class Fighter extends JpaEntityImpl implements FighterUnit {

	/**
	 * 等级
	 */
	protected int level;

	/**
	 * hp
	 */
	protected int hpValue;

	@Embedded
	protected PeopleAttribute attributes;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHpValue() {
		return hpValue;
	}

	public void setHpValue(int hpValue) {
		this.hpValue = hpValue;
	}

	public PeopleAttribute getAttributes() {
		return attributes;
	}

	public void setAttributes(PeopleAttribute attributes) {
		this.attributes = attributes;
	}

	/**
	 * 当前装备列表
	 */
	@Transient
	protected List<Equipment> equipments;

	/**
	 * 当前战斗属性
	 */
	@Transient
	protected FightAttributes attrs;

	/**
	 * 当前hp量
	 */
	@Transient
	protected Hp hp;

	@Override
	public List<FighterMessage> prepareFighting(List<Equipment> equipments) {
		hp = new Hp(hpValue);
		// 初化战斗属性
		attrs = EquipmentHelper.getFightAttributes(equipments);

		return Collections.singletonList(null);
	}

	@Override
	public List<FighterMessage> restFighting() {
		hp = new Hp(hpValue);

		return Collections.singletonList(null);
	}

}
