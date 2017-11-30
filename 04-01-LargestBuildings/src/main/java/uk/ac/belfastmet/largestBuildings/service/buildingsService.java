package uk.ac.belfastmet.largestBuildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.Building;

@Service

public class buildingsService {
		
		public buildingsService() {
			super();
		}

			public ArrayList<Building> getFloorBuilding(){
			ArrayList<Building> buildings = new ArrayList<Building>();
			
			Building newCenturyGlobalCenter = new Building("New Building Global Center", "1_New Century Global Center.jpg", "China", "Chengdu", "1,760,000 m2");
			buildings.add(newCenturyGlobalCenter);
			Building dubaiInternationalAirportTerminal3 = new Building("Dubai International Airport Terminal 3", "2_Dubai International Airport Terminal 3.jpg", "UAE", "Dubai", "1,713,000 m2");
			buildings.add(dubaiInternationalAirportTerminal3);
			Building AbrajAlBaitEndowment = new Building("Abraj Al-Bait Endowment", "3_Abraj Al-Bait Endowment.jpg", "Saudi Arabia", "Mecca", "1,575,815 m2");
			buildings.add(AbrajAlBaitEndowment);
			Building centralWorld = new Building("CentralWorld", "4_CentralWorld.jpg", "Thailand", "Bangkok", "1,024,000 m2");
			buildings.add(centralWorld);
			Building aalsmeerFlowerAuction = new Building("Aalsmeer Flower Auction", "5_Aalsmeer Flower Auction.jpg", "Netherlands", "Aalsmeer", "990,000 m2");
			buildings.add(aalsmeerFlowerAuction);
			Building beijingCapitalInternationalAirportTerminal3 = new Building("Beijing Capital International Airport Terminal 3", "6_Beijing Capital International Airport Terminal 3.jpg", "China", "Beijing", "986,000 m2");
			buildings.add(beijingCapitalInternationalAirportTerminal3);
			Building theVenetianMacao = new Building("The Venetian Macao", "7_The Venetian Macao.jpg", "Macau", "Macau", "980,000 m2");
			buildings.add(theVenetianMacao);
			Building sandsCotaiCentral = new Building("Sands Cotai Central", "8_Sands Cotai Central.jpg", "Macau", "Macau", "890,000 m2");
			buildings.add(sandsCotaiCentral);
			Building ciputraWorldSurabaya = new Building("Ciputra World Surabaya", "9_Ciputra World Surabaya.jpg", "Indonesia", "Surabaya", "750,000 m2");
			buildings.add(ciputraWorldSurabaya);
			Building berjayaTimesSquare = new Building("Berjaya Times Square", "10_Berjaya Times Square.jpg", "Malaysia", "Kuala Lumpar", "700,000 m2");
			buildings.add(berjayaTimesSquare);

			
	        return buildings;
			}
		
		

			public ArrayList<Building> getFootprintBuilding(){
			ArrayList<Building> buildings = new ArrayList<Building>();
		
			Building aalsmeerFlowerAuction = new Building("Aalsmeer Flower Auction","1_Aalsmeer Flower Auction.jpg","Netherlands", "Aalsmeer", "518,000 m2");
			buildings.add(aalsmeerFlowerAuction);
			Building teslaFactory = new Building("Tesla Factory", "2_Tesla Factory.jpg", "United States", "Fremont, California", "427,354 m2");
			buildings.add(teslaFactory);
            Building boeingEverettFactory = new Building("Boeing Everett Factory", "3_Boeing Everett Factory.jpg", "United States", "Everett, Washington", "398,000 m2");
            buildings.add(boeingEverettFactory);
            Building michelinDistributionCenter = new Building("Michelin Distribution Center", "4_Michelin Distribution Center.jpg", "United States", "Spartanburg, South Carolina", "371,612 m2");
            buildings.add(michelinDistributionCenter);
            Building greatMosqueOfMecca = new Building("Great Mosque of Mecca", "5_Great Mosque of Mecca.jpg", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000 m2");
            buildings.add(greatMosqueOfMecca);
            Building nikeNorthAmericaLogisticsCenter = new Building("Nike - North America Logistics Center", "6_Nike - North America Logistics Center.jpg", "United States", "Memphis, Tennessee", "260,000 m2");
            buildings.add(nikeNorthAmericaLogisticsCenter);
            Building johnDeereNAmericanPDC = new Building("John Deere North American Parts Distribution Center", "7_John Deere North American Parts Distribution Center.jpg", "United States", "Milan, Illinois", "246,000 m2");
            buildings.add(johnDeereNAmericanPDC);
            Building mallOfDubai = new Building("Mall of Dubai", "8_Mall of Dubai.jpg", "United Arab Emirates", "Dubai", "500,000 m2");
            buildings.add(mallOfDubai);
            Building mitsubishiMotorsNAmerica = new Building("Mitsubishi Motors North America", "9_Mitsubishi Motors North America.jpg", "United States", "Normal, Illinois", "220,000 m2");
            buildings.add(mitsubishiMotorsNAmerica);
            Building indonesiaConventionExhibition = new Building("Indonesia Convention Exhibition", "10_Indonesia Convention Exhibition.jpg", "Indonesia",  "Bumi Serpong Damai", "220,000 m2");
            buildings.add(indonesiaConventionExhibition);

			return buildings;
			}
			
			
			public ArrayList<Building> getVolumeBuilding(){
			ArrayList<Building> buildings = new ArrayList<Building>();
		
			Building boeingEverettFactory = new Building("Boeing Everett Factory","1_Boeing_Everett_Plant.jpg","United States", "Everett", "13.3 million m3");
			buildings.add(boeingEverettFactory);
			Building greatMosqueofMecca= new Building("Great Mosque of Mecca", "2_Great_Mosque_of_Mecca.jpg", "Saudi Arabia", "Hijaz-Saudi Arabia", "8,000,000 m3");
			buildings.add(greatMosqueofMecca);
            Building jeanLucLagardèrePlant = new Building("Jean-Luc Lagardère Plant", "3_Jean_Luc LAgardere Plant.jpg", "France", "Toulouse-Blagnac", "5,600,000m3");
            buildings.add(jeanLucLagardèrePlant);
            Building boeingCompositeWingCenter = new Building("Boeing Composite Wing Center", "4_Boeing Composite Wing Center.jpg", "United States", "Everett, Washington", "3,700,000 m3");
            buildings.add(boeingCompositeWingCenter);
            Building aerium = new Building("Aerium", "5_Aerium.JPG", "Germany", "Halbe, Brandenburg", "5,200,000 m3");
            buildings.add(aerium);
            Building meyerWerftDockhalle2 = new Building("Meyer Werft Dockhalle 2", "6_Meyer Werft Dockhalle 2.jpg", "Germany", "Papenburg, Niedersachsen", "4,720,000 m3");
            buildings.add(meyerWerftDockhalle2);
            Building nASAVehicleAssemblyBuilding = new Building("NASA Vehicle Assembly Building", "7_Vehicle Assembly Building.jpg", "United States", "Brevard County, Florida", "3,660,000 m3");
            buildings.add(nASAVehicleAssemblyBuilding);
            Building theO2 = new Building("The O2", "8_The O2.jpg", "United Kingdom", "London", "2,790,000");
            buildings.add(theO2);
            Building tescoIrelandDistributionCentre = new Building("Tesco Ireland Distribution Centre", "9_Tesco Ireland Distribution Centre.jpg", "Ireland", "Donabate, Fingal", "1,550,000");
            buildings.add(tescoIrelandDistributionCentre);
            Building targetImportWarehouse = new Building("Target Import Warehouse", "10_Target Import Warehouse.jpg", "United States", "Savannah, Georgia", "1,500,000 m3");
            buildings.add(targetImportWarehouse);
            
			return buildings;
			}
		
		}

