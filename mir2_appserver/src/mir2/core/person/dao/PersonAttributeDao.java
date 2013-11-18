/**
 * mir2 game
 */
package mir2.core.person.dao;

import java.util.List;

import mir2.core.person.beans.PersonAttribute;

import com.webjvm.core.dao.BaseDao;

/**
 * @author mudsong@gmail.com
 * 
 */
public interface PersonAttributeDao extends BaseDao<PersonAttribute> {

	/**
	 * 根据职业取得列表
	 * 
	 * @param clazz
	 * @return
	 */
	public <T extends PersonAttribute> List<T> findListByProfession(
			Class<T> clazz);
	
	public <T extends PersonAttribute> T get(Class<T> clazz, Long id);

}
