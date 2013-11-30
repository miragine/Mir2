/**
 * mir2 game
 */
package mir2.core.sys.manager;

import static org.junit.Assert.fail;

import java.util.Date;

import mir2.core.sys.beans.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mudsong@gmail.com
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class UserManagerTest {

	@Autowired
	private UserManager userManager;

	@Test
	public void testRegister() {
		User user = new User();
		user.setUsername("test1");
		user.setPassword("test1");
		user.setCreateDate(new Date());
		userManager.save(user);
	}

	@Test
	public void testCheckUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserByUsername() {
		fail("Not yet implemented");
	}

}
