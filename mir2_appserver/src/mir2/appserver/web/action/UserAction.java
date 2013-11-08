/**
 * mir2 game
 */
package mir2.appserver.web.action;

import javax.servlet.http.HttpServletRequest;

import mir2.core.sys.beans.User;
import mir2.core.sys.manager.UserManager;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author mudsong@gmail.com
 * 
 */
@Controller("userAction")
public class UserAction extends ActionSupport implements ServletRequestAware {

	@Autowired
	private UserManager userManager;

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

		User user = userManager.checkUser(username, password);
		if (user == null) {
			user = userManager.register(username, password);
		}

		request.setAttribute("username", "aaaaaaaaaaa");

		return SUCCESS;
	}

	public String register() throws Exception {
		if (username == null || username.equals("")) {
			return ERROR;
		}
		if (password == null || password.equals("")) {
			return ERROR;
		}

		User user = userManager.checkUser(username, password);
		if (user == null) {
			user = userManager.register(username, password);
			request.setAttribute("user", user);
			request.setAttribute("username", "aaaaaaaaaaa");
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