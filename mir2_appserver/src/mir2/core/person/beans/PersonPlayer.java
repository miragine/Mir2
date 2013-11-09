/**
 * miragine.com
 */
package mir2.core.person.beans;

import javax.jdo.annotations.PersistenceCapable;

/**
 * 人物对象
 * 
 * @author zoday
 *
 */
@PersistenceCapable
public class PersonPlayer {
	
	/**
	 * 人物名称
	 */
	protected String name;
	
	/**
	 * 性别
	 */
	protected PersonSex sex;
	
	/**
	 * 种族
	 */
	protected PersonRace race;
	
	/**
	 * 人物属性，随着等级提升发生变化
	 */
	protected PersonAttribute attribute;

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

}