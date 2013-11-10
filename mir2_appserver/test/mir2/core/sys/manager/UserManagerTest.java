/**
 * mir2 game
 */
package mir2.core.sys.manager;

import static org.junit.Assert.fail;

import java.util.Date;

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
 * @author mudsong@gmail.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class UserManagerTest {
	
	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(
			new LocalDatastoreServiceTestConfig());
	
	@Autowired
	private UserManager userManager;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		helper.setUp();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		helper.tearDown();
	}

	/**
	 * Test method for {@link mir2.core.sys.manager.UserManager#register(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testRegister() {
		User user = new User();
		user.setUsername("test1");
		user.setPassword("test1");
		user.setCreateDate(new Date());
		userManager.save(user);
	}

	/**
	 * Test method for {@link mir2.core.sys.manager.UserManager#checkUser(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCheckUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link mir2.core.sys.manager.UserManager#getUserByUsername(java.lang.String)}.
	 */
	@Test
	public void testGetUserByUsername() {
		fail("Not yet implemented");
	}

}
