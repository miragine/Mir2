/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.beans;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import mir2.common.db.Entity;

/**
 * 
 */
@PersistenceCapable
public class User extends Entity {
	
	@Persistent
	private String username;
	
	@Persistent
	private String password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}
