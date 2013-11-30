/**
 * miragine.com
 */
package mir2.core.person.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import mir2.common.db.JpaEntityImpl;
import mir2.core.people.beans.Fighter;
import mir2.core.props.beans.Equipment;
import mir2.core.sys.beans.User;

/**
 * 人物对象
 * 
 * @author zoday
 * 
 */
@Entity
@Table(name = "TB_PERSON_PLAYER")
public class PersonPlayer extends JpaEntityImpl {

	/**
	 * 角色名称
	 */
	private String name;

	private User owner;

	/**
	 * 人物属性，随着等级提升发生变化
	 */
	private Fighter fighter;

	/**
	 * 装备列表
	 */
	@Transient
	private List<Equipment> equipments;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}