/**
 * Copyright (c) mir2.miragine.com 2014.<br>
 * 
 * Created on 2013年11月30日
 * @author <a href="mailto:zoday@webjvm.com">zoday</a>
 * @version $Revision: 1.0$
 */
package mir2.core.people.dao;

import java.util.List;

import mir2.core.people.beans.Fighter;

import com.webjvm.core.dao.BaseDao;

/**
 *
 */
public interface FighterDao extends BaseDao<Fighter> {

	/**
	 * 根据职业取得列表
	 * 
	 * @param clazz
	 * @return
	 */
	public <T extends Fighter> List<T> findListByProfession(Class<T> clazz);

	public <T extends Fighter> T get(Class<T> clazz, Long id);

}
