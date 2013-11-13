/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.dao;

import java.util.List;

import mir2.core.person.beans.PersonPlayer;
import mir2.core.sys.beans.User;

import com.webjvm.core.dao.BaseDao;

/**
 * 
 */
public interface PersonPlayerDao extends BaseDao<PersonPlayer> {
	
	public List<PersonPlayer> findListByUser(User user);

}
