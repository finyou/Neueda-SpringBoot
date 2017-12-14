package uk.ac.belfastmet.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rhi {
	
		public Rhi() {
			
		}
	
		@Id
		@GeneratedValue 
		
		private Integer rhiId;
		private String name;
		private Double date;
		private String location;
		private String technology;
		private Integer capacity;
		private Double payments;
		
		public Rhi(Integer rhiId, String name, Double date, String location, String technology, Integer capacity,
				Double payments) {
			super();
			this.rhiId = rhiId;
			this.name = name;
			this.date = date;
			this.location = location;
			this.technology = technology;
			this.capacity = capacity;
			this.payments = payments;
		}

		public Integer getRhiId() {
			return rhiId;
		}

		public void setRhiId(Integer rhiId) {
			this.rhiId = rhiId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getDate() {
			return date;
		}

		public void setDate(Double date) {
			this.date = date;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getTechnology() {
			return technology;
		}

		public void setTechnology(String technology) {
			this.technology = technology;
		}

		public Integer getCapacity() {
			return capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public Double getPayments() {
			return payments;
		}

		public void setPayments(Double payments) {
			this.payments = payments;
		}
	
		
		
		
		

	}
