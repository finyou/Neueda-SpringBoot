package uk.ac.belfastmet.titanic.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repositories.PassengerRepository;

@Service
public class DataLoader {

	@Autowired
	private PassengerRepository passengerRepository;
	
	public DataLoader(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	
	public void loadData() {
		
		
		

		}
	
}
