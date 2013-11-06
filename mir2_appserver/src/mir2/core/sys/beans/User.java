/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.sys.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.webjvm.core.entity.BaseEntity;

/**
 * 
 */
@Entity
public class User implements BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected Date createDate;

	private String username;
	
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

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
