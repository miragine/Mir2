/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.dao;

import mir2.core.sys.beans.User;

import com.webjvm.core.dao.BaseDao;

/**
 * ”√ªß
 */
public interface UserDao extends BaseDao<User> {
	
	public User getUserByUsername(String username);

}
