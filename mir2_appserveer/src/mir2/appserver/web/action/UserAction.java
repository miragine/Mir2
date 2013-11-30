/**
 * mir2 game
 */
package mir2.appserver.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mir2.common.spring.SpringMvcAction;
import mir2.core.sys.beans.User;
import mir2.core.sys.manager.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户登录入口
 * 
 * @author mudsong@gmail.com
 * 
 */
@Controller
public class UserAction extends SpringMvcAction {

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username == null || username.equals("")) {
			return ERROR;
		}
		if (password == null || password.equals("")) {
			return ERROR;
		}

		User user = userManager.checkUser(username, password);
		if (user == null) {
			return ERROR;
		}

		session.setAttribute("user", user);

		return "index";
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username == null || username.equals("")) {
			return ERROR;
		}
		if (password == null || password.equals("")) {
			return ERROR;
		}

		User user = userManager.checkUser(username, password);
		if (user == null) {
			user = userManager.register(username, password);
			return "";
		} else {
			return ERROR;
		}
	}

}
