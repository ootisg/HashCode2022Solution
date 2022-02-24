package stuff;

import java.util.ArrayList;

public class Project {
	
	String name;
	int durration;
	int score;
	int bestBefore;
	ArrayList <Skill> skillsRequired;
	
	public Project (String name, int durration, int score, int bestBefore) {
		this.name = name;
		this.durration = durration;
		this.score = score;
		this.bestBefore = bestBefore;
	}
	
	public void addRole (Skill requiredSkill) {
		skillsRequired.add(requiredSkill);
	}

	public String getName() {
		return name;
	}

	public int getDurration() {
		return durration;
	}

	public int getScore() {
		return score;
	}

	public int getBestBefore() {
		return bestBefore;
	}

	public ArrayList<Skill> getSkillsRequired() {
		return skillsRequired;
	}
	
	
	

}
