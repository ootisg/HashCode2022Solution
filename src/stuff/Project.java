package stuff;

import java.util.ArrayList;

public class Project {
	
	String name;
	int durration;
	int score;
	int bestBefore;
	ArrayList <Skill> skillsRequired;
	int progressState; //0 = not started 1 = working on 2 = done
	
	public Project (String name, int durration, int score, int bestBefore) {
		this.name = name;
		this.durration = durration;
		this.score = score;
		this.bestBefore = bestBefore;
		progressState = 0;
	}
	
	public void start () {
		progressState = 1;
	}
	
	public void finish () {
		progressState = 2;
	}
	
	public int getState () {
		return progressState;
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
	
	public int getTimeLeft (int day) {
		return bestBefore - day;
	}
	
	public int getPoints (int finishedDay) {
		if (finishedDay < bestBefore) {
			return score;
		}
		
		return score - (finishedDay - bestBefore);
		
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
