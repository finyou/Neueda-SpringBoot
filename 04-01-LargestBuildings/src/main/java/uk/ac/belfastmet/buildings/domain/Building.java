package uk.ac.belfastmet.buildings.domain;

public class Building {
	
			private String name;
			private String image;
			private String country;
			private String place;
			private String size;
			
			public Building(String name, String image, String country, String place, String size) {
				super();
				this.name = name;
				this.image = image;
				this.country = country;
				this.place = place;
				this.size = size;
			}
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}

			public String getImage() {
				return image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getCountry() {
				return country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getPlace() {
				return place;
			}

			public void setPlace(String place) {
				this.place = place;
			}

			public String getSize() {
				return size;
			}

			public void setSize(String size) {
				this.size = size;
			}
			

		}

