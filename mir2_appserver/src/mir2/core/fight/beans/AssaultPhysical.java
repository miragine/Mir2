/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.beans;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.PersistenceCapable;

/**
 * 物理攻击
 */
@PersistenceCapable(detachable = "true")
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class AssaultPhysical extends FightAttributeScope {

	public AssaultPhysical(int min, int max) {
		super(min, max);
	}

}