/**
 * mir2 game
 */
package mir2.admin.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理员登录入口
 * 
 * @author mudsong@gmail.com
 *
 */
@Controller
public class AdminAction extends ActionSupport implements ServletRequestAware {
	
	@Autowired
	private String defaultUsername;

	@Autowired
	private String defaultPassword;
	
	private HttpServletRequest request;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String login() throws Exception {
		if (username == null || username.equals("")) {
			return ERROR;
		}
		if (password == null || password.equals("")) {
			return ERROR;
		}
		
		if (username.equals(defaultUsername)
				&& password.equals(defaultPassword)) {
			request.getSession().setAttribute("status", "LOGIN");
			request.getSession().setAttribute("username", username);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	public String logout() throws Exception {
		request.getSession().removeAttribute("username");
		return SUCCESS;
	}

	private String username;

	private String password;

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
