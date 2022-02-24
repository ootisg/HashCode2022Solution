package stuff;

import java.util.ArrayList;

public class Person {

	String name;
	ArrayList <Skill> skills = new ArrayList <Skill>();
	
	public Person() {
		
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
