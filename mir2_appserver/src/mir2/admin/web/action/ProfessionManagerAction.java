/**
 * mir2 game
 */
package mir2.admin.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mir2.common.spring.SpringMvcAction;
import mir2.core.fight.beans.Hp;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.person.beans.profession.Warrior;
import mir2.core.person.manager.ProfessionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 职业管理
 * 
 * @author mudsong@gmail.com
 * 
 */
@Controller
@RequestMapping("/admin/profession")
public class ProfessionManagerAction extends SpringMvcAction {

	private static final String REQUEST_PATH = "/admin/profession";

	@Autowired
	private ProfessionManager professionManager;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String list(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		List<Warrior> warriors = professionManager
				.findListByProfession(Warrior.class);
		request.setAttribute("warriors", warriors);
		return REQUEST_PATH + "/index";
	}

	@RequestMapping(value = "/init.do", method = RequestMethod.GET)
	public String init(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		for (int i = 1; i <= 35; i++) {
			Warrior warrior = new Warrior();
			warrior.setLevel(i);
			warrior.setHp(new Hp(10 * i));
			professionManager.save(warrior);
			logger.info("Save {}", warrior.getId());
		}

		return REDIRECT + REQUEST_PATH + "/index.do";
	}

}
