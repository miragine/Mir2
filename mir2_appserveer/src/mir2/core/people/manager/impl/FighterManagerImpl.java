/**
 * Copyright (c) mir2.miragine.com 2014.<br>
 * 
 * Created on 2013年11月30日
 * @author <a href="mailto:zoday@webjvm.com">zoday</a>
 * @version $Revision: 1.0$
 */
package mir2.core.people.manager.impl;

import java.util.List;

import mir2.core.people.beans.Fighter;
import mir2.core.people.dao.FighterDao;
import mir2.core.people.manager.FighterManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webjvm.core.manager.impl.BaseManagerImpl;

/**
 *
 */
@Service
public class FighterManagerImpl extends BaseManagerImpl<Fighter, FighterDao>
		implements FighterManager {

	@Autowired
	private FighterDao fighterDao;

	@Override
	public <T extends Fighter> List<T> findListByProfession(Class<T> clazz) {
		return fighterDao.findListByProfession(clazz);
	}

	@Override
	public <T extends Fighter> void removeAllByProfession(Class<T> clazz) {
		List<T> list = fighterDao.findListByProfession(clazz);
		if (list != null && !list.isEmpty()) {
			for (T profession : list) {
				fighterDao.remove(profession);
			}
		}
	}

	@Override
	public <T extends Fighter> T get(Class<T> clazz, int level) {
		return fighterDao.get(clazz, Long.valueOf(level));
	}

}
