/**
 * mir2 game
 */
package mir2.admin.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mir2.common.spring.SpringMvcAction;
import mir2.core.people.beans.Assassin;
import mir2.core.people.beans.Fighter;
import mir2.core.people.beans.Magician;
import mir2.core.people.beans.Taoist;
import mir2.core.people.beans.Warrior;
import mir2.core.people.manager.FighterManager;
import mir2.core.person.enums.ProfessionInitData;

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
	private FighterManager fighterManager;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String list(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		// 取得战士列表
		request.setAttribute("warriors",
				fighterManager.findListByProfession(Warrior.class));
		request.setAttribute("taoists",
				fighterManager.findListByProfession(Taoist.class));
		request.setAttribute("magicians",
				fighterManager.findListByProfession(Magician.class));
		request.setAttribute("assassins",
				fighterManager.findListByProfession(Assassin.class));

		return REQUEST_PATH + "/index";
	}

	@RequestMapping(value = "/init.do", method = RequestMethod.GET)
	public String init(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		String type = request.getParameter("type");
		ProfessionInitData initData = ProfessionInitData.valueOfType(type);

		try {
			for (int level = 1; level <= 35; level++) {
				Fighter fighter = initData.getClassType().newInstance();
				fighter.setId(Long.valueOf(level));
				fighter.setLevel(level);
				fighter.setHpValue(initData.getHp(level));
				fighterManager.save(fighter);
				logger.info("Save {}", fighter.getId());
			}
		} catch (Exception e) {
			logger.warn("Create class object error.", e);
		}

		return REDIRECT + REQUEST_PATH + "/index.do";
	}

}
