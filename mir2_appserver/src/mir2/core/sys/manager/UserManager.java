/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.manager;

import mir2.core.sys.beans.User;

import com.webjvm.core.manager.BaseManager;

/**
 * �û�
 */
public interface UserManager extends BaseManager<User> {
	
	/**
	 * ע���û�
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User register(String username, String password);
	
	/**
	 * ����û�
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User checkUser(String username, String password);

}
