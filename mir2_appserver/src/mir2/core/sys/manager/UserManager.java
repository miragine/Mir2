/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.manager;

import mir2.core.sys.beans.User;

import com.webjvm.core.manager.BaseManager;

/**
 * ”√ªß
 */
public interface UserManager extends BaseManager<User> {
	
	public User register(String username, String password);
	
	public User checkUser(String username, String password);

}
