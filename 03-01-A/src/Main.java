import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<String>dwarfs = new ArrayList<String>();
		
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Bashful");
		dwarfs.add("Dopey");
		dwarfs.add("Grumpy");
		dwarfs.add("Sneezy");
		dwarfs.add("Hangry");
		
		ArrayList<String>dwarves = new ArrayList<String>();
		
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Glorin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		dwarves.add("Oin");
		
		System.out.println("The disney dwarfs are: ");
		for (int i=0; i<dwarfs.size(); i++) {
		System.out.println(dwarfs.get(i));
		}
		System.out.println("The LOTR dwarves are: ");
		for (int i=0; i<dwarves.size(); i++) {
		System.out.println(dwarves.get(i));
		}

	}

}
