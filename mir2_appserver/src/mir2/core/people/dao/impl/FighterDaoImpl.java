/**
 * Copyright (c) mir2.miragine.com 2014.<br>
 * 
 * Created on 2013年11月30日
 * @author <a href="mailto:zoday@webjvm.com">zoday</a>
 * @version $Revision: 1.0$
 */
package mir2.core.people.dao.impl;

import java.util.List;

import mir2.core.people.beans.Fighter;
import mir2.core.people.dao.FighterDao;

import org.springframework.stereotype.Repository;

import com.webjvm.core.dao.impl.BaseDaoImpl;

/**
 *
 */
@Repository
public class FighterDaoImpl extends BaseDaoImpl<Fighter> implements FighterDao {

	@Override
	public <T extends Fighter> List<T> findListByProfession(Class<T> clazz) {
		return null;
	}

	@Override
	public <T extends Fighter> T get(Class<T> clazz, Long id) {
		return null;
	}

}
