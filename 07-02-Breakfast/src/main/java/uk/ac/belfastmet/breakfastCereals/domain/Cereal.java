package uk.ac.belfastmet.breakfastCereals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cereal {
	
		public Cereal() {
			
		}
	
		@Id
		@GeneratedValue 
		
		private Integer cerealID;
		
		@NotEmpty
		private String manufacturer;
		@NotEmpty
		private String name;
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
		
		public Cereal(Integer cerealID, String manufacturer, String name, Integer energy, Integer calories, Integer protein,
				Integer carb, Integer sugar, Integer fat, Integer saturates, Integer fibre, String sodium,
				String salt, String iron) {
			super();
			this.manufacturer = manufacturer;
			this.name = name;
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

		public Integer getCerealID() {
			return cerealID;
		}

		public void setCerealID(Integer cerealID) {
			this.cerealID = cerealID;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getEnergy() {
			return energy;
		}

		public void setEnergy(Integer energy) {
			this.energy = energy;
		}

		public Integer getCalories() {
			return calories;
		}

		public void setCalories(Integer calories) {
			this.calories = calories;
		}

		public Integer getProtein() {
			return protein;
		}

		public void setProtein(Integer protein) {
			this.protein = protein;
		}

		public Integer getCarb() {
			return carb;
		}

		public void setCarb(Integer carb) {
			this.carb = carb;
		}

		public Integer getSugar() {
			return sugar;
		}

		public void setSugar(Integer sugar) {
			this.sugar = sugar;
		}

		public Integer getFat() {
			return fat;
		}

		public void setFat(Integer fat) {
			this.fat = fat;
		}

		public Integer getSaturates() {
			return saturates;
		}

		public void setSaturates(Integer saturates) {
			this.saturates = saturates;
		}

		public Integer getFibre() {
			return fibre;
		}

		public void setFibre(Integer fibre) {
			this.fibre = fibre;
		}

		public String getSodium() {
			return sodium;
		}

		public void setSodium(String sodium) {
			this.sodium = sodium;
		}

		public String getSalt() {
			return salt;
		}

		public void setSalt(String salt) {
			this.salt = salt;
		}

		public String getIron() {
			return iron;
		}

		public void setIron(String iron) {
			this.iron = iron;
		}
		
}
