/**
 * mir2 game
 */
package mir2.core.person.manager;

import java.util.List;

import mir2.core.person.beans.PersonAttribute;

import com.webjvm.core.manager.BaseManager;

/**
 * 职业管理
 * 
 * @author mudsong@gmail.com
 * 
 */
public interface ProfessionManager extends BaseManager<PersonAttribute> {

	/**
	 * 取得职业列表
	 * 
	 * @param clazz
	 * @return
	 */
	public <T extends PersonAttribute> List<T> findListByProfession(
			Class<T> clazz);

}
