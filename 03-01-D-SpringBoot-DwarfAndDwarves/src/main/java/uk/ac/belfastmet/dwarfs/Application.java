package uk.ac.belfastmet.dwarfs;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@SpringBootApplication
public class Application {
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs() {
		
		ArrayList<Dwarf> dwarves = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarves.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarves.add(happy);
		Dwarf hangry = new Dwarf("Hangry", "Disney", "Hangry.jpg");
		dwarves.add(hangry);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarves.add(bashful);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarves.add(grumpy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarves.add(dopey);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarves.add(doc);
		Dwarf Thorin = new Dwarf("Thorin","LOTR","Thorin.png");
		dwarves.add(Thorin);
        Dwarf Fili = new Dwarf("Fili","LOTR","Fili.png");
        dwarves.add(Fili);
        Dwarf Kili = new Dwarf("Kili","LOTR","Kili.png");
        dwarves.add(Kili);
        Dwarf Oin = new Dwarf("Oin","LOTR","Oin.png");
        dwarves.add(Oin);
        Dwarf Gloin = new Dwarf("Gloin","LOTR","Gloin.png");
        dwarves.add(Gloin);
        Dwarf Balin = new Dwarf("Balin","LOTR","Balin.png");
        dwarves.add(Balin);
        Dwarf Dwalin = new Dwarf("Dwalin","LOTR","Dwalin.png");
        dwarves.add(Dwalin);
        Dwarf Ori = new Dwarf("Ori","LOTR","Ori.png");
        dwarves.add(Ori);
        Dwarf Dori = new Dwarf("Dori","LOTR","Dori.png");
        dwarves.add(Dori);
        Dwarf Nori = new Dwarf("Nori","LOTR","Nori.png");
        dwarves.add(Nori);
        Dwarf Bifur = new Dwarf("Bifur","LOTR","Bifur.png");
        dwarves.add(Bifur);
        Dwarf Bofur = new Dwarf("Bofur","LOTR","Bofur.png");
        dwarves.add(Bofur);
        Dwarf Bombur = new Dwarf("Bombur","LOTR","Bombur.png");
        dwarves.add(Bombur);

		
		
		for (int i=0; i<dwarves.size(); i++) {
		if (dwarves.get(i).getAuthor().equals("Disney")) {
			System.out.println("Snow White's Dwarfs are: " + dwarves.get(i).getName());
		}
		else System.out.println("LOTR Dwarves are: " + dwarves.get(i).getName());
	}
	}


	}

