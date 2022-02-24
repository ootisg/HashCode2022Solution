package stuff;

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

}
