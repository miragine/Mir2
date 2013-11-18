/**
 * mir2 game
 */
package mir2.core.person.dao.impl;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import mir2.common.db.JdoBaseDaoImpl;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.person.dao.PersonAttributeDao;

import org.springframework.stereotype.Repository;

/**
 * @author mudsong@gmail.com
 * 
 */
@Repository
@SuppressWarnings("unchecked")
public class PersonAttributeDaoImpl extends JdoBaseDaoImpl<PersonAttribute>
		implements PersonAttributeDao {

	@Override
	public <T extends PersonAttribute> List<T> findListByProfession(
			Class<T> clazz) {
		PersistenceManager persistenceManager = getJdoTemplate()
				.getPersistenceManagerFactory().getPersistenceManager();
		Query query = persistenceManager.newQuery(clazz);
		query.setOrdering("id");
		return (List<T>) query.execute();
	}

	@Override
	public <T extends PersonAttribute> T get(Class<T> clazz, Long id) {
		return getJdoTemplate().getObjectById(clazz, id);
	}

}
