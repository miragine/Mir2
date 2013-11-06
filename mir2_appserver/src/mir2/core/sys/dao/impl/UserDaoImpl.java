/**
 * mir2 game
 */
package mir2.core.sys.dao.impl;

import org.springframework.stereotype.Repository;

import mir2.common.db.JdoBaseDaoImpl;
import mir2.core.sys.beans.User;
import mir2.core.sys.dao.UserDao;

/**
 * @author mudsong@gmail.com
 * 
 */
@Repository
public class UserDaoImpl extends JdoBaseDaoImpl<User> implements UserDao {

}
