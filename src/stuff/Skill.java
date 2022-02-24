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
	
	public boolean isSufficient (Skill a, Skill b) {
		if (a.skillName.equals (b.skillName)) {
			if (a.getLevel () >= b.getLevel ()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isSufficientWithMentor (Skill a, Skill b) {
		if (a.skillName.equals (b.skillName)) {
			if (a.getLevel () >= b.getLevel () - 1) {
				return true;
			}
		}
		return false;
	}
	
}
