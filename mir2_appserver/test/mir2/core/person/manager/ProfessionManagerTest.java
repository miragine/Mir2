/**
 * mir2 game
 */
package mir2.core.person.manager;

import static org.junit.Assert.fail;
import mir2.core.fight.beans.Hp;
import mir2.core.person.beans.profession.Warrior;

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
public class ProfessionManagerTest {
	
	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(
			new LocalDatastoreServiceTestConfig());
	
	@Autowired
	private ProfessionManager professionManager;

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

	@Test
	public void testFindListByProfession() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.webjvm.core.manager.BaseManager#get(java.lang.Long)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.webjvm.core.manager.BaseManager#save(com.webjvm.core.entity.BaseEntity)}.
	 */
	@Test
	public void testSave() {
		for(int i = 1; i <= 35; i++) {
			Warrior warrior = new Warrior();
			warrior.setLevel(i);
			warrior.setHpValue(45 + (18 * i));
			professionManager.save(warrior);
		}
	}

	/**
	 * Test method for {@link com.webjvm.core.manager.BaseManager#remove(com.webjvm.core.entity.BaseEntity)}.
	 */
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

}
