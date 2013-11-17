/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.admin.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mir2.common.spring.SpringMvcAction;
import mir2.core.person.beans.PersonPlayer;
import mir2.core.person.manager.PersonPlayerManager;
import mir2.core.person.manager.PersonRaceManager;
import mir2.core.person.manager.ProfessionManager;
import mir2.core.sys.beans.User;
import mir2.core.sys.manager.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 */
@Controller
@RequestMapping("/admin/player")
public class PersonPlayerAction extends SpringMvcAction {

	@Autowired
	protected UserManager userManager;

	@Autowired
	protected PersonPlayerManager personPlayerManager;

	@Autowired
	protected PersonRaceManager personRaceManager;
	
	@Autowired
	private ProfessionManager professionManager;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String list(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		Long userId = Long.valueOf(request.getParameter("userId"));

		User user = userManager.get(userId);
		if (user == null) {
			return ERROR;
		}

		List<PersonPlayer> players = personPlayerManager.findListByUser(user);

		request.setAttribute("players", players);
		return "/player/index";
	}
	
	@RequestMapping(value = "/create.do", method = RequestMethod.GET)
	public String create(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		int level = Integer.valueOf(request.getParameter("level"));
		String type = request.getParameter("type");
		
		
		
		return "";
	}

}
