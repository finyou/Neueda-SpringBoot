package uk.ac.belfastmet.top10.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.top10.domain.Top10;

@Service

public class top10service {
		
		public top10service() {
			super();
		}

			public ArrayList<Top10> getTop10(){
			ArrayList<Top10> top10 = new ArrayList<Top10>();
			
			Top10 ayeaye = new Top10("Ayeaye", "ayeaye.png", 1);
			top10.add(ayeaye);
			Top10 blobfish = new Top10("Blobfish", "blobfish1.png", 2);
			top10.add(blobfish);
			Top10 hairyfrogfish = new Top10("Hairy Frog Fish", "hairyfrogfish.png", 3);
			top10.add(hairyfrogfish);
			Top10 jerboa = new Top10("Jerboa", "jerboa.png", 4);
			top10.add(jerboa);
			Top10 axolotl = new Top10("Axolotl", "axolotl.png", 5);
			top10.add(axolotl);
			Top10 saiga = new Top10("Saiga", "saiga.png", 6);
			top10.add(saiga);
			Top10 shoebill = new Top10("Shoebill", "shoebill.png", 7);
			top10.add(shoebill);
			Top10 slenderloris = new Top10("Slender-Loris", "slender-loris.png", 8);
			top10.add(slenderloris);
			Top10 solenodon = new Top10("Solenodon", "solenodon.png", 9);
			top10.add(solenodon);
			Top10 yeticrab = new Top10("Yeticrab", "yeticrab.png", 10);
			top10.add(yeticrab);
			return top10;
			
			}
}
