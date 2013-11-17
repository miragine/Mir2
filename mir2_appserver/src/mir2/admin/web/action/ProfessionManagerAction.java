/**
 * mir2 game
 */
package mir2.admin.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mir2.common.spring.SpringMvcAction;
import mir2.core.person.beans.PersonAttribute;
import mir2.core.person.beans.profession.Assassin;
import mir2.core.person.beans.profession.Magician;
import mir2.core.person.beans.profession.Taoist;
import mir2.core.person.beans.profession.Warrior;
import mir2.core.person.enums.ProfessionInitData;
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
		request.setAttribute("warriors",
				professionManager.findListByProfession(Warrior.class));
		request.setAttribute("taoists",
				professionManager.findListByProfession(Taoist.class));
		request.setAttribute("magicians",
				professionManager.findListByProfession(Magician.class));
		request.setAttribute("assassins",
				professionManager.findListByProfession(Assassin.class));

		return REQUEST_PATH + "/index";
	}

	@RequestMapping(value = "/init.do", method = RequestMethod.GET)
	public String init(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		String type = request.getParameter("type");
		ProfessionInitData initData = ProfessionInitData.valueOfType(type);

		try {
			for (int level = 1; level <= 35; level++) {
				PersonAttribute profession = initData.getClassType()
						.newInstance();
				profession.setId(Long.valueOf(level));
				profession.setLevel(level);
				profession.setHpValue(initData.getHp(level));
				professionManager.save(profession);
				logger.info("Save {}", profession.getId());
			}
		} catch (Exception e) {
			logger.warn("Create class object error.", e);
		}

		return REDIRECT + REQUEST_PATH + "/index.do";
	}

}
