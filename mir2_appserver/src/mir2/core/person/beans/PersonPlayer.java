/**
 * miragine.com
 */
package mir2.core.person.beans;

import javax.jdo.annotations.PersistenceCapable;

/**
 * �������
 * 
 * @author zoday
 *
 */
@PersistenceCapable
public class PersonPlayer {
	
	/**
	 * ��������
	 */
	protected String name;
	
	/**
	 * �Ա�
	 */
	protected PersonSex sex;
	
	/**
	 * ����
	 */
	protected PersonRace race;
	
	/**
	 * �������ԣ����ŵȼ����������仯
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
