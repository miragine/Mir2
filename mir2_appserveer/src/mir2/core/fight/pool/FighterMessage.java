/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.fight.pool;

import mir2.core.fight.enums.SkillType;

/**
 * 战斗消息
 */
public class FighterMessage {

	/**
	 * 主动
	 */
	private FighterUnit source;

	/**
	 * 目标
	 */
	private FighterUnit target;

	/**
	 * 所使用的技能
	 */
	private SkillType skill;

	/**
	 * 数值
	 */
	private int value;

	/**
	 * @return the source
	 */
	public FighterUnit getSource() {
		return source;
	}

	/**
	 * @return the target
	 */
	public FighterUnit getTarget() {
		return target;
	}

	/**
	 * @return the skill
	 */
	public SkillType getSkill() {
		return skill;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	public FighterMessage(FighterUnit source, FighterUnit target,
			SkillType skill, int value) {
		this.source = source;
		this.target = target;
		this.skill = skill;
		this.value = value;
	}

}
