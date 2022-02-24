package stuff;

<<<<<<< HEAD
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
	
=======
import java.util.List;

public class GameState implements GameStateSpec {

	@Override
	public List<Person> getPeople () {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjects () {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAvailablePeople () {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getIncompleteProjects () {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectsInProgress () {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCurrentScore () {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentTime () {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void syncToState (GameStateSpec gs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beginProject (Project p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completeAllProjects () {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPerson (Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int setTime () {
		// TODO Auto-generated method stub
		return 0;
	}
>>>>>>> 2ed6e6dc2aaf4c7e499bf9e411db444679373c0f

}
