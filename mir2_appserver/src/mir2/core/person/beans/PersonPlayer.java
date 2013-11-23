/**
 * miragine.com
 */
package mir2.core.person.beans;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import mir2.common.db.JdoEntityImpl;
import mir2.core.fight.pool.FighterUnit;
import mir2.core.props.beans.Equipment;
import mir2.core.sys.beans.User;

/**
 * 人物对象
 * 
 * @author zoday
 *
 */
@PersistenceCapable
public class PersonPlayer extends JdoEntityImpl {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	protected Long id;

	@Persistent
	protected Date createDate;
	
	@Persistent
	protected User user;
	
	/**
	 * 人物名称
	 */
	@Persistent
	protected String name;
	
	/**
	 * 性别
	 */
	@Persistent
	protected PersonSex sex;
	
	/**
	 * 种族
	 */
	@Persistent
	protected PersonRace race;
	
	/**
	 * 人物属性，随着等级提升发生变化
	 */
	@Persistent
	protected PersonAttribute attribute;
	
	@NotPersistent
	protected List<Equipment> equipments;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public PersonSex getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(PersonSex sex) {
		this.sex = sex;
	}

	/**
	 * @return the race
	 */
	public PersonRace getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(PersonRace race) {
		this.race = race;
	}

	/**
	 * @return the attribute
	 */
	public PersonAttribute getAttribute() {
		return attribute;
	}

	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(PersonAttribute attribute) {
		this.attribute = attribute;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	public FighterUnit getFighterUnit() {
		return attribute.getFighterUnit(equipments);
	}

}