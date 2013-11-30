/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.manager.impl;

import java.util.List;

import mir2.core.person.beans.PersonPlayer;
import mir2.core.person.dao.PersonPlayerDao;
import mir2.core.person.manager.PersonPlayerManager;
import mir2.core.sys.beans.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webjvm.core.manager.impl.BaseManagerImpl;

/**
 * 
 */
@Service
public class PersonPlayerManagerImpl extends
		BaseManagerImpl<PersonPlayer, PersonPlayerDao> implements
		PersonPlayerManager {

	@Autowired
	protected PersonPlayerDao personPlayerDao;
	
	@Override
	public List<PersonPlayer> findListByUser(User user) {
		return personPlayerDao.findListByUser(user);
	}

}
