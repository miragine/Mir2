/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.beans;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import mir2.common.db.JdoEntityImpl;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.props.beans.Equipment;

/**
 * 人物属性
 */
@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class PersonAttribute extends JdoEntityImpl {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	protected Long id;

	@Persistent
	protected Date createDate;

	/**
	 * 等级
	 */
	@Persistent
	protected int level;

	@Persistent
	protected int hpValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

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

	/**
	 * 战斗单位
	 * 
	 * @param equipments
	 * @return
	 */
	public abstract FighterUnit getFighterUnit(Long id, List<Equipment> equipments);

}