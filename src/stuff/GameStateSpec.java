package stuff;

import java.util.List;

public interface GameStateSpec {
	
	public List<Person> getPeople ();
	public List<Project> getProjects ();
	public List<Person> getAvailablePeople ();
	public List<Project> getIncompleteProjects ();
	public List<Project> getProjectsInProgress ();
	public int getCurrentScore ();
	public int getCurrentTime ();
	public void syncToState (GameStateSpec gs);
	public void beginProject (Project p);
	public void completeAllProjects ();

}
