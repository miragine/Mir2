/**
 * mir2 game
 */
package mir2.admin.web.action;

import mir2.common.spring.SpringMvcAction;
import mir2.core.sys.beans.User;
import mir2.core.sys.manager.UserManager;

import org.datanucleus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 管理员登录入口
 * 
 * @author mudsong@gmail.com
 * 
 */
@Controller("adminAction")
public class AdminAction extends SpringMvcAction {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private String defaultUsername;

	@Autowired
	private String defaultPassword;
	
	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String login(@PathVariable String name, ModelMap model) {
		if (StringUtils.isEmpty(name)) {
			return ERROR;
		}

		if (StringUtils.isEmpty(name)) {
			return ERROR;
		}
		
		User user = userManager.checkUser(name, name);

		if (name.equals(defaultUsername)
				&& name.equals(defaultPassword)) {
			// request.getSession().setAttribute("status", "LOGIN");
			model.addAttribute("username", name);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
