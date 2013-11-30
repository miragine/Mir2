/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;


/**
 * 战斗
 */
public interface Fighting {
	
	/**
	 * 1对1战斗
	 * 
	 * @param active
	 * @param passive
	 * @return
	 */
	public FighterSpider singled(FighterUnit active, FighterUnit passive);

}
