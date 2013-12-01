/**
 * Copyright (c) mir2.miragine.com 2014.<br>
 * 
 * Created on 2013年12月1日
 * @author <a href="mailto:zoday@webjvm.com">zoday</a>
 * @version $Revision: 1.0$
 */
package mir2.common.db;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.webjvm.core.dao.BaseDao;
import com.webjvm.core.entity.BaseEntity;
import com.webjvm.core.utils.GenericsUtils;
import com.webjvm.core.utils.PageBean;

/**
 *
 */
@SuppressWarnings("unchecked")
public class JpaBaseDaoImpl<T extends BaseEntity> extends JpaDaoSupport
		implements BaseDao<T> {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected Class<T> entityClass;

	public JpaBaseDaoImpl() {
		entityClass = GenericsUtils.getSuperClassGenricType(getClass());
	}

	@Override
	public T get(Long id) {
		return getJpaTemplate().find(entityClass, id);
	}

	@Override
	public List<T> getAll() {
		String queryString = "from " + entityClass.getName();
		return (List<T>) getJpaTemplate().find(queryString);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(PageBean pageBean) {
		Criteria criteria = super.getSession().createCriteria(entityClass);
		criteria.setFirstResult(pageBean.getFirstResult());
		criteria.setMaxResults(pageBean.getMaxResults());
		return (List<T>) criteria.list();
	}

	@Override
	public void remove(T entity) {
		getHibernateTemplate().delete(entity);
		logger.debug("remove class={}", entity);
	}

	@Override
	public void removeById(Long id) {
		remove(get(id));
		logger.debug("remove class={}, id={}", entityClass, id);
	}

	@Override
	public int removeAll() {
		String hql = "delete from " + entityClass.getSimpleName();
		Query query = getS
		return query.executeUpdate();
	}

	@Override
	public void save(T entity) {
		logger.debug("save class={}", entity);
		entity.setCreateDate(new Date());
		getHibernateTemplate().save(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		if (entity.getId() == null) {
			save(entity);
		} else {
			update(entity);
		}
	}

	@Override
	public void update(T entity) {
		logger.debug("update class={}", entity);
		getHibernateTemplate().update(entity);
	}

}
