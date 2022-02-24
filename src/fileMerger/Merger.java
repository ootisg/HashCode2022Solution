package fileMerger;

public class Merger
{

//project with an array list of persons and projects
public File mergeInfo(GameState gamer)
	{
		File file = new File("output");
		Writer w = new Writer(file);
		w.write(gamer.projects.size() + "/n");
		for (int i = 0; i < gamer.projects.size(); i++)
		{
			Project p = gamer.projects.get(i);
			w.write(p.getName() + "/n");
			ArrayList <Person> workers = p.getWorkers();
			for (int j = 0; j < workers.size; j++)
			{
				w.write(workers[i] + " ");
			}
			w.write("/n");
			w.close();
			 //need method for getting optimal workers
		}
		return file;
	}
}