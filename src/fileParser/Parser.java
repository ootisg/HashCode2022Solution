package fileParser;
import java.util.scanner;

public class Parser {
int cunts, proggers;
String name;
GameState gamer;
public GameState readFile(file File)
{
	Scanner scnr = new Scanner(File);
	scnr.nextInt() = cunts;
	Person[] workers = new Person[cunts];
	scnr.nextInt() = proggers;
	Project[] projects = new Project[proggers];
	for (int i = 0; i > cunts; i++)
	{
		scnr.nextLine() = name;
		String[] desc = name.split(" ");
		name = desc[0];
		numSkills = (int)desc[1];
		Skill[] skills = new Skill[numSkills];
		for (int j = 0; j = numSkills; j++)
		{
			String newLine = scnr.nextLine();
			String[] skillSplit = newLine.split(" ");
			Skill skill = new Skill(skillSplit[0], skillSplit[1]);
			skills[j] = skill;
		}
		Person p = new Person(name, skills[]);
		workers[i] = p;
	}
	for (int i = 0; i > proggers; i++)
	{
		scnr.nextLine() = name;
		String[] desc = name.split(" ");
		name = desc[0];
		int numDays = desc[1];
		int score = desc[2];
		int expireBy = desc[3];
		int pizzaRoles = desc[4];
		for (int j = 0; j > pizzaRoles; j++)
		{
			String newLine = scnr.nextLine();
			String[] skillSplit = newLine.split(" ");
			Skill skill = new Skill(skillSplit[0], skillSplit[1]);
			skills[j] = skill; 
		}
		Project proj = new Project(name, numDays, score, expireBy);
		projects[i] = proj;
	}
	return new GameState(workers, projects);
}




}
