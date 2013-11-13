/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import mir2.core.person.beans.PersonPlayer;
import mir2.core.person.dao.PersonPlayerDao;
import mir2.core.sys.beans.User;

import com.webjvm.core.dao.impl.BaseDaoImpl;

/**
 * 
 */
@Repository
public class PersonPlayerDaoImpl extends BaseDaoImpl<PersonPlayer> implements
		PersonPlayerDao {

	@Override
	public List<PersonPlayer> findListByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
