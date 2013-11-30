/**
 * mir2 game
 */
package mir2.core.sys.dao.impl;

import java.util.List;

import mir2.core.sys.beans.User;
import mir2.core.sys.dao.UserDao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.webjvm.core.dao.impl.BaseDaoImpl;

/**
 * @author mudsong@gmail.com
 * 
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User getUserByUsername(String username) {
		Criteria criteria = super.getSession().createCriteria(entityClass);
		criteria.add(Restrictions.eq("username", username));
		criteria.addOrder(Order.desc("id"));
		List<?> list = criteria.list();
		if (list != null && list.size() > 0) {
			return (User) list.get(0);
		} else {
			return null;
		}
	}
}
