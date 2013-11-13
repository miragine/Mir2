/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.manager;

import java.util.List;

import mir2.core.person.beans.PersonPlayer;
import mir2.core.sys.beans.User;

import com.webjvm.core.manager.BaseManager;

/**
 * 
 */
public interface PersonPlayerManager extends BaseManager<PersonPlayer> {

	public List<PersonPlayer> findListByUser(User user);

}
