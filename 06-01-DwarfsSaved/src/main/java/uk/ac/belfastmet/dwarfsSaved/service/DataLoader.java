package uk.ac.belfastmet.dwarfsSaved.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfsSaved.domain.Dwarf;
import uk.ac.belfastmet.dwarfsSaved.repositories.DwarfRepository;

@Service
public class DataLoader {

	@Autowired
	private DwarfRepository dwarfRepository;
	
	public DataLoader(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	
	public void loadData() {
		
		
		
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfRepository.save(sleepy);
		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfRepository.save(happy);
		Dwarf hangry = new Dwarf("Hangry", "Disney", "Hangry.jpg");
		dwarfRepository.save(hangry);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfRepository.save(bashful);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfRepository.save(grumpy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfRepository.save(dopey);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfRepository.save(doc);
		
		
		Dwarf Thorin = new Dwarf("Thorin","LOTR","Thorin.png");
		dwarfRepository.save(Thorin);
		Dwarf Fili = new Dwarf("Fili","LOTR","Fili.png");
		dwarfRepository.save(Fili);
		Dwarf Kili = new Dwarf("Kili","LOTR","Kili.png");
		dwarfRepository.save(Kili);
		Dwarf Oin = new Dwarf("Oin","LOTR","Oin.png");
		dwarfRepository.save(Oin);
		Dwarf Gloin = new Dwarf("Gloin","LOTR","Gloin.png");
		dwarfRepository.save(Gloin);
		Dwarf Balin = new Dwarf("Balin","LOTR","Balin.png");
		dwarfRepository.save(Balin);
		Dwarf Dwalin = new Dwarf("Dwalin","LOTR","Dwalin.png");
		dwarfRepository.save(Dwalin);
		Dwarf Ori = new Dwarf("Ori","LOTR","Ori.png");
		dwarfRepository.save(Ori);
		Dwarf Dori = new Dwarf("Dori","LOTR","Dori.png");
		dwarfRepository.save(Dori);
		Dwarf Nori = new Dwarf("Nori","LOTR","Nori.png");
		dwarfRepository.save(Nori);
		Dwarf Bifur = new Dwarf("Bifur","LOTR","Bifur.png");
		dwarfRepository.save(Bifur);
		Dwarf Bofur = new Dwarf("Bofur","LOTR","Bofur.png");
		dwarfRepository.save(Bofur);
		Dwarf Bombur = new Dwarf("Bombur","LOTR","Bombur.png");
		dwarfRepository.save(Bombur);
		
		
	
		}
	
}
