/**
 * mir2 game
 */
package mir2.core.sys.manager.impl;

import mir2.core.sys.beans.User;
import mir2.core.sys.dao.UserDao;
import mir2.core.sys.manager.UserManager;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webjvm.core.manager.impl.BaseManagerImpl;

/**
 * UserManager
 * 
 * @author mudsong@gmail.com
 * 
 */
@Service
public class UserManagerImpl extends BaseManagerImpl<User, UserDao> implements
		UserManager {

	@Autowired
	protected UserDao userDao;

	@Override
	public User register(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDao.save(user);
		return user;
	}

	@Override
	public User checkUser(String username, String password) {
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return null;
		}

		User user = userDao.getUserByUsername(username);
		if (user != null) {
			if (password.equals(user.getPassword())) {
				return user;
			}
		}

		return null;
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

}
