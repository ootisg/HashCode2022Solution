package stuff;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	
	String name;
	int durration;
	int score;
	int bestBefore;
	ArrayList <Skill> skillsRequired;
	
	HashMap<String, Boolean> skillsFulfilled;
	HashMap<Person, Skill> skillsUsed;
	
	public Project (String name, int durration, int score, int bestBefore) {
		this.name = name;
		this.durration = durration;
		this.score = score;
		this.bestBefore = bestBefore;
		skillsFulfilled = new HashMap<String, Boolean> ();
	}
	
	public Project (Project p) {
		this (p.name, p.durration, p.score, p.bestBefore);
		skillsFulfilled = new HashMap (p.skillsFulfilled);
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
		Project curr = new Project (this);
		
		
	}
	
	public boolean canAddPerson (Person person) {
		
		for (int i = 0; i < )
		
		ArrayList<Skill> skills = person.skills;
		for (int i = 0; i < skills.size (); i++) {
			Boolean hasSkill = skillsFulfilled.get (skills.get (i).skillName);
			if (hasSkill == null) {
				
			}
		}
		
	}
	
}
