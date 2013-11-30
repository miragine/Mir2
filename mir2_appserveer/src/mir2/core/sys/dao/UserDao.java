/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.dao;

import mir2.core.sys.beans.User;

import com.webjvm.core.dao.BaseDao;

/**
 * 用户
 */
public interface UserDao extends BaseDao<User> {
	
	public User getUserByUsername(String username);

}