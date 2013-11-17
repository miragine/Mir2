/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.dao.impl;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import mir2.common.db.JdoBaseDaoImpl;
import mir2.core.person.beans.PersonPlayer;
import mir2.core.person.dao.PersonPlayerDao;
import mir2.core.sys.beans.User;

import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class PersonPlayerDaoImpl extends JdoBaseDaoImpl<PersonPlayer> implements
		PersonPlayerDao {

	@Override
	public List<PersonPlayer> findListByUser(User user) {

		PersistenceManager persistenceManager = getJdoTemplate()
				.getPersistenceManagerFactory().getPersistenceManager();
		Query query = persistenceManager.newQuery(entityClass);
		return (List<PersonPlayer>) query.execute();
	}

}
