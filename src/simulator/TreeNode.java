package simulator;

import java.util.ArrayList;
import java.util.List;

import stuff.GameState;
import stuff.GameStateSpec;
import stuff.Person;
import stuff.Project;

public class TreeNode {

	GameState gs;
	
	public TreeNode (GameState gs) {
		
		this.gs = gs;
		
	}
	
	public void assignToProject (Project p, Person people) {
		
		//Single person version of assign to project
		ArrayList<Person> peoples = new ArrayList<Person> ();
		peoples.add (people);
		assignToProject (p, peoples);
		
	}
	
	public void assignToProject (Project p, List<Person> people) {
		
		//Do the thing
		
	}
	
	public void beginProject (Project p) {
		
	}
	
	public GameState getGameState () {
		return gs;
	}
	
}
