/**
 * mir2 game
 */
package mir2.core.person.manager.impl;

import java.util.List;

import mir2.core.person.beans.PersonAttribute;
import mir2.core.person.dao.PersonAttributeDao;
import mir2.core.person.manager.ProfessionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webjvm.core.manager.impl.BaseManagerImpl;

/**
 * @author mudsong@gmail.com
 * 
 */
@Service
public class ProfessionManagerImpl extends BaseManagerImpl<PersonAttribute, PersonAttributeDao>
		implements ProfessionManager {
	
	@Autowired
	private PersonAttributeDao personAttributeDao;

	@Override
	public <T extends PersonAttribute> List<T> findListByProfession(
			Class<T> clazz) {
		
		
		
		return null;
	}

}