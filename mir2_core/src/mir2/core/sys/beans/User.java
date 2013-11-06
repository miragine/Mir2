/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.beans;

import javax.persistence.Entity;

import mir2.common.db.JdoEntity;

/**
 * 
 */
@Entity
public class User extends JdoEntity {
	
	private static final long serialVersionUID = -4797897545439530376L;

	private String username;
	
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
