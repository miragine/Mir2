/**
 * mir2 game
 */
package mir2.common.db;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

/**
 * @author mudsong@gmail.com
 * 
 */
@Controller("persistenceManagerFactory")
public class AppEnginePfmFactory implements
		FactoryBean<PersistenceManagerFactory>, InitializingBean {

	private PersistenceManagerFactory pmfInstance;

	@Override
	public PersistenceManagerFactory getObject() throws Exception {
		return pmfInstance;
	}

	@Override
	public Class<?> getObjectType() {
		return PersistenceManagerFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		pmfInstance = JDOHelper
				.getPersistenceManagerFactory("transactions-optional");
	}

}
