package stuff;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	
	String name;
	int durration;
	int score;
	int bestBefore;
	ArrayList <Skill> skillsRequired;
	
	HashMap<Skill, Boolean> skillsFulfilled;
	
	public Project (String name, int durration, int score, int bestBefore) {
		this.name = name;
		this.durration = durration;
		this.score = score;
		this.bestBefore = bestBefore;
	}
	
	public Project (Project p) {
		this (p.name, p.durration, p.score, p.bestBefore);
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
	
	public ArrayList<ArrayList<Person>> getAllValidTeams (ArrayList<Person> availablePeople) {
		
		ArrayList<ArrayList<Person>> allTeams = new ArrayList<ArrayList<Person>> ();
		
		
	}
	
	public boolean canAddPerson (ArrayList<Person> currentPeople, Person p) {
		
		
		
	}
	
}
