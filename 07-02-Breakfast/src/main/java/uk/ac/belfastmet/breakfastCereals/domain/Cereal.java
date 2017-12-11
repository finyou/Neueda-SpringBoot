package uk.ac.belfastmet.breakfastCereals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {
	
		public Cereal() {
			
		}
	
		@Id
		@GeneratedValue 
		
		private Integer cerealID;
		private String manufacturer;
		private String cereal;
		private Integer energy;
		private Integer calories;
		private Integer protein;
		private Integer carb;
		private Integer sugar;
		private Integer fat;
		private Integer saturates;
		private Integer fibre;
		private String sodium;
		private String salt;
		private String iron;
		
		public Cereal(Integer cerealID, String manufacturer, String cereal, Integer energy, Integer calories, Integer protein,
				Integer carb, Integer sugar, Integer fat, Integer saturates, Integer fibre, String sodium,
				String salt, String iron) {
			super();
			this.manufacturer = manufacturer;
			this.cereal = cereal;
			this.energy = energy;
			this.calories = calories;
			this.protein = protein;
			this.carb = carb;
			this.sugar = sugar;
			this.fat = fat;
			this.saturates = saturates;
			this.fibre = fibre;
			this.sodium = sodium;
			this.salt = salt;
			this.iron = iron;
		}
}
