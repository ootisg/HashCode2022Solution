package stuff;

import java.util.ArrayList;

public class Person {

	String name;
	ArrayList <Skill> skills = new ArrayList <Skill>();
	
	Project workingOn = null;
	
	public Person() {
		
	}
	
	void workOn (Project p) {
		workingOn = p;
	}
	
	void complete () {
		workingOn = null;
	}
	
	Project getCurrentlyWorkedOnProject() {
		return workingOn;
	}
	
	void levelUpSkil (String skill) {
		for (int i = 0; i < skills.size(); i++) {
			if (skills.get(i).getName().equals(skill)) {
				skills.get(i).levelUp();
			}
		}
		skills.add(new Skill (skill,1));
	}
	
	int getSkillLevel (String skill) {
		for (int i = 0; i < skills.size(); i++) {
			if (skills.get(i).getName().equals(skill)) {
				return skills.get(i).level;
			}
		}
		return 0;
	}
	
}
