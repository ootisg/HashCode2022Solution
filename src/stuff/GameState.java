package stuff;

import java.util.ArrayList;

public class GameState {
	public ArrayList <Person> people = new ArrayList <Person> (); 
	
	public ArrayList <Project> projects = new ArrayList <Project> ();
	
	public GameState (ArrayList <Person> people, ArrayList <Project> projects) {
		this.people = people;
		this.projects = projects;	
	}
	
	public ArrayList <Person> getPeople (){
		return people;
	}
	
	public ArrayList <Project> getProjects (){
		return projects;
	}
	
	public ArrayList <Person> getAvilablePeople(){
		ArrayList <Person> avilableDudes = new ArrayList <Person> ();
		
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).getCurrentlyWorkedOnProject() == null) {
				avilableDudes.add(people.get(i));
			}
		}
		return avilableDudes;
	}
	
	public ArrayList <Project> getIncompleteProjects(){
		ArrayList <Project> incompleteProjects = new ArrayList <Project> ();
		
		for (int i = 0; i < projects.size(); i++) {
			if (projects.get(i).getState() == 0 ) {
				avilableDudes.add(people.get(i));
			}
		}
		return avilableDudes;
	}
	
	//make set time method
	

}
