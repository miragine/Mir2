/**
 * mir2 game
 */
package mir2.core.sys.manager.impl;

import mir2.core.sys.beans.User;
import mir2.core.sys.dao.UserDao;
import mir2.core.sys.manager.UserManager;

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

}
