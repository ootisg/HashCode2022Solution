package stuff;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	
	String name;
	int durration;
	int score;
	int bestBefore;
	ArrayList <Skill> skillsRequired;
	int progressState; //0 = not started 1 = working on 2 = done
	
	HashMap<String, Boolean> skillsFulfilled;
	HashMap<Person, Skill> skillsUsed;
	
	public Project (String name, int durration, int score, int bestBefore) {
		this.name = name;
		this.durration = durration;
		this.score = score;
		this.bestBefore = bestBefore;
<<<<<<< HEAD
		skillsFulfilled = new HashMap<String, Boolean> ();
	}
	
	public Project (Project p) {
		this (p.name, p.durration, p.score, p.bestBefore);
		skillsFulfilled = new HashMap (p.skillsFulfilled);
=======
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
>>>>>>> dd4aff84cd70df774b9b9c93f2192c30f5f71eb2
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
