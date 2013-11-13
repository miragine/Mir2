/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mir2.core.person.beans.PersonRace;
import mir2.core.person.dao.PersonRaceDao;
import mir2.core.person.manager.PersonRaceManager;

import com.webjvm.core.manager.impl.BaseManagerImpl;

/**
 * 
 */
@Service
public class PersonRaceManagerImpl extends
		BaseManagerImpl<PersonRace, PersonRaceDao> implements PersonRaceManager {
	
	@Autowired
	protected PersonRaceDao personRaceDao;

}
