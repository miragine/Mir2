/**
 * mir2 game
 */
package mir2.core.sys.dao.impl;

import java.util.Collection;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import mir2.common.db.JdoBaseDaoImpl;
import mir2.core.sys.beans.User;
import mir2.core.sys.dao.UserDao;

import org.springframework.stereotype.Repository;

/**
 * @author mudsong@gmail.com
 * 
 */
@Repository
public class UserDaoImpl extends JdoBaseDaoImpl<User> implements UserDao {

	@Override
	public User getUserByUsername(String username) {
		String filter = "username == usernameParam";
		String parameters = "String usernameParam";
		Collection<User> list = getJdoTemplate().find(entityClass, filter,
				parameters, new Object[] { username });
		if (list != null && !list.isEmpty()) {
			return list.iterator().next();
		} else {
			return null;
		}
	}
}
