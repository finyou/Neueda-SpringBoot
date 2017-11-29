package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@Service
public class DwarfService {
	
	private ArrayList <Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarves;
	
	public DwarfService() {
		super();
	}

	public ArrayList<Dwarf> getDisneyDwarfs(){
ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(happy);
		Dwarf hangry = new Dwarf("Hangry", "Disney", "Hangry.jpg");
		dwarfs.add(hangry);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(dopey);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		
        return dwarfs;
	}
	
	

	public ArrayList<Dwarf> getTolkienDwarves(){
ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
	
Dwarf Thorin = new Dwarf("Thorin","LOTR","Thorin.png");
dwarfs.add(Thorin);
Dwarf Fili = new Dwarf("Fili","LOTR","Fili.png");
dwarfs.add(Fili);
Dwarf Kili = new Dwarf("Kili","LOTR","Kili.png");
dwarfs.add(Kili);
Dwarf Oin = new Dwarf("Oin","LOTR","Oin.png");
dwarfs.add(Oin);
Dwarf Gloin = new Dwarf("Gloin","LOTR","Gloin.png");
dwarfs.add(Gloin);
Dwarf Balin = new Dwarf("Balin","LOTR","Balin.png");
dwarfs.add(Balin);
Dwarf Dwalin = new Dwarf("Dwalin","LOTR","Dwalin.png");
dwarfs.add(Dwalin);
Dwarf Ori = new Dwarf("Ori","LOTR","Ori.png");
dwarfs.add(Ori);
Dwarf Dori = new Dwarf("Dori","LOTR","Dori.png");
dwarfs.add(Dori);
Dwarf Nori = new Dwarf("Nori","LOTR","Nori.png");
dwarfs.add(Nori);
Dwarf Bifur = new Dwarf("Bifur","LOTR","Bifur.png");
dwarfs.add(Bifur);
Dwarf Bofur = new Dwarf("Bofur","LOTR","Bofur.png");
dwarfs.add(Bofur);
Dwarf Bombur = new Dwarf("Bombur","LOTR","Bombur.png");
dwarfs.add(Bombur);

return dwarfs;


}
	
}
