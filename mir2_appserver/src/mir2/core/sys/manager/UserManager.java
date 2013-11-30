/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.manager;

import mir2.core.sys.beans.User;

import com.webjvm.core.manager.BaseManager;

/**
 * 用户
 */
public interface UserManager extends BaseManager<User> {
	
	/**
	 * 注册用户
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User register(String username, String password);
	
	/**
	 * 检查用户
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User checkUser(String username, String password);
	
	/**
	 * 根据用户名取得用户
	 * 
	 * @param username
	 * @return
	 */
	public User getUserByUsername(String username);

}