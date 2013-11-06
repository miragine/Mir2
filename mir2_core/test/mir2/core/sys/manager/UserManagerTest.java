/**
 * mir2 game
 */
package mir2.core.sys.manager;

import static org.junit.Assert.fail;

import java.util.Date;

import javax.jdo.PersistenceManagerFactory;

import mir2.core.sys.beans.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

/**
 * 
 * 
 * @author mudsong@gmail.com
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class UserManagerTest {

	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(
			new LocalDatastoreServiceTestConfig());

	@Autowired
	private PersistenceManagerFactory persistenceManagerFactory;

	@Before
	public void setUp() throws Exception {
		helper.setUp();
	}

	@After
	public void tearDown() throws Exception {
		helper.tearDown();
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		User user = new User();
		user.setUsername("admin");
		user.setPassword("112233");
		user.setCreateDate(new Date());
		persistenceManagerFactory.getPersistenceManager().makePersistent(user);
	}
	
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

}
