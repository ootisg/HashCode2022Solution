package stuff;

public class Skill {

	String skillName;
	int level;
	
	public Skill (String name, int level) {
		skillName = name;
		this.level = level;
	}
	
	int getLevel() {
		return level;
	}
	
	void levelUp() {
		level = level + 1;
	}
	
	String getName () {
		return skillName;
	}
	
}
