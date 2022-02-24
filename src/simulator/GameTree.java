package simulator;

import java.util.ArrayList;

import stuff.GameState;
import stuff.GameStateSpec;
import stuff.Person;
import stuff.Project;

public class GameTree {

	private TreeNode head;
	
	public GameTree (ArrayList<Person> people, ArrayList<Project> projects) {
		
		//Create the initial game state
		GameState gs = new GameState ();
		for (int i = 0; i < people.size (); i++) {
			gs.addPerson (people.get (i));
		}
		for (int i = 0; i < projects.size (); i++) {
			gs.addProject (projects.get (i));
		}
		
		//Set head accordingly
		head = new TreeNode (gs);
		
	}
	
	public TreeNode getHead () {
		return head;
	}

}
