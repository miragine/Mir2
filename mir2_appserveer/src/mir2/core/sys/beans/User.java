/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import mir2.common.db.JpaEntityImpl;

/**
 * 用户
 */
@Entity
@Table(name = "TB_USER")
public class User extends JpaEntityImpl {

	protected String username;

	protected String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
