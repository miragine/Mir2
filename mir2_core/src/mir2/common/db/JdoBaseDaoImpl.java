/**
 * mir2 game
 */
package mir2.common.db;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import org.springframework.orm.jdo.support.JdoDaoSupport;

import com.webjvm.core.dao.BaseDao;
import com.webjvm.core.utils.GenericsUtils;
import com.webjvm.core.utils.PageBean;

/**
 * 基于JDO实现的DAO
 * 
 * @author mudsong@gmail.com
 * 
 */
@SuppressWarnings("unchecked")
public abstract class JdoBaseDaoImpl<T extends JdoEntity> extends JdoDaoSupport
		implements BaseDao<T> {

	protected Class<T> entityClass;

	public JdoBaseDaoImpl() {
		entityClass = GenericsUtils.getSuperClassGenricType(getClass());
	}

	@Override
	public T get(Long id) {
		return getJdoTemplate().getObjectById(entityClass, id);
	}

	@Override
	public List<T> getAll() {
		return (List<T>) getJdoTemplate().find(entityClass);
	}

	@Override
	public List<T> getAll(PageBean pageBean) {
		PersistenceManager persistenceManager = getJdoTemplate()
				.getPersistenceManagerFactory().getPersistenceManager();
		Query query = persistenceManager.newQuery(entityClass);
		query.setRange(pageBean.getFirstResult(), pageBean.getFirstResult()
				+ pageBean.getMaxResults());
		return (List<T>) query.execute();
	}

	@Override
	public void remove(T entity) {
		getJdoTemplate().deletePersistent(entity);
	}

	@Override
	public int removeAll() {
		// TODO
		return 0;
	}

	@Override
	public void removeById(Long id) {
		T entity = get(id);
		getJdoTemplate().deletePersistent(entity);
	}

	@Override
	public void save(T entity) {
		getJdoTemplate().makePersistent(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		getJdoTemplate().makePersistent(entity);
	}

	@Override
	public void update(T entity) {
		getJdoTemplate().makePersistent(entity);
	}

}
