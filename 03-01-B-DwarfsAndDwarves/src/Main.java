import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {

	ArrayList<Dwarf> dwarfes = new ArrayList<Dwarf>();
	
	Dwarf sleepy = new Dwarf();
	sleepy.setName("Sleepy");
	sleepy.setAuthor("Disney");
	sleepy.setImage("Sleepy.png");
	
	Dwarf happy = new Dwarf();
	happy.setName("Happy");
	happy.setAuthor("Disney");
	happy.setImage("Happy.png");
	
	Dwarf hangry = new Dwarf();
	hangry.setName("Hangry");
	hangry.setAuthor("Disney");
	hangry.setImage("Hangry.png");
	
	dwarfes.add(sleepy);
	dwarfes.add(happy);
	dwarfes.add(hangry);
	}

}
