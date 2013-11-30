/**
 * mir2 game
 */
package mir2.core.person.manager;

import static org.junit.Assert.fail;
import mir2.core.people.beans.Warrior;
import mir2.core.people.manager.FighterManager;

import org.junit.After;
import org.junit.Before;
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
public class ProfessionManagerTest {

	@Autowired
	private FighterManager fighterManager;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindListByProfession() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.webjvm.core.manager.BaseManager#get(java.lang.Long)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.webjvm.core.manager.BaseManager#save(com.webjvm.core.entity.BaseEntity)}
	 * .
	 */
	@Test
	public void testSave() {
		for (int i = 1; i <= 35; i++) {
			Warrior warrior = new Warrior();
			warrior.setLevel(i);
			warrior.setHpValue(45 + i * 9);
			fighterManager.save(warrior);
		}
	}

	/**
	 * Test method for
	 * {@link com.webjvm.core.manager.BaseManager#remove(com.webjvm.core.entity.BaseEntity)}
	 * .
	 */
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

}
