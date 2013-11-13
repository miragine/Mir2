/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.beans;

import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.PersistenceCapable;

/**
 * 
 * HP
 */
@PersistenceCapable(detachable = "true")
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public class Hp extends FightAttributeFixed {
	
	public Hp(int value) {
		super(value);
	}

}
