/**
 * mir2 game
 */
package mir2.admin.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mir2.common.spring.SpringMvcAction;
import mir2.core.sys.manager.UserManager;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 管理员登录
 * 
 * @author mudsong@gmail.com
 * 
 */
@Controller
@Lazy(false)
@RequestMapping("/admin")
public class AdminAction extends SpringMvcAction implements InitializingBean {

	@Autowired
	private String defaultUsername;

	@Autowired
	private String defaultPassword;

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (StringUtils.isEmpty(username)) {
			return ERROR;
		}

		if (StringUtils.isEmpty(password)) {
			return ERROR;
		}

		if (username.equals(defaultUsername)
				&& password.equals(defaultPassword)) {
			session.setAttribute("status", "LOGIN");
			session.setAttribute("username", username);
			return "redirect:/admin/index.do";
		} else {
			return ERROR;
		}
	}

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String list() {
		return "/admin/index";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

}
