/**
 * mir2 game
 */
package mir2.admin.web.action;

import java.util.List;

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
 * @author mudsong@gmail.com
 * 
 */
@Controller
@RequestMapping("/admin/user")
public class UserManagerAction extends SpringMvcAction {

	private static final String REQUEST_PATH = "/admin/user";

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String list(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		List<User> users = userManager.getAll();
		request.setAttribute("users", users);
		return REQUEST_PATH + "/index";
	}

	@RequestMapping(value = "/create.do")
	public String create(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = userManager.getUserByUsername(username);
		if (user != null) {
			return "create";
		}

		userManager.register(username, password);
		return REDIRECT + REQUEST_PATH + "/index.do";
	}

}
