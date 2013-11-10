/**
 * mir2 game
 */
package mir2.core.person.dao.impl;

import java.util.List;

import mir2.common.db.JdoBaseDaoImpl;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.person.dao.PersonAttributeDao;

import org.springframework.stereotype.Repository;

/**
 * @author mudsong@gmail.com
 * 
 */
@Repository
public class PersonAttributeDaoImpl extends JdoBaseDaoImpl<PersonAttribute>
		implements PersonAttributeDao {

	@Override
	public <T extends PersonAttribute> List<T> findListByProfession(
			Class<T> clazz) {
		return (List<T>) getJdoTemplate().find(clazz);
	}

}
