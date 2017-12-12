package uk.ac.belfastmet.breakfastCereals.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.breakfastCereals.repositories.CerealRepository;
import uk.ac.belfastmet.breakfastCereals.domain.Cereal;

@Service
public class DataLoader {

	@Autowired
	private CerealRepository cerealRepository;
	
	public DataLoader(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}

	
	public void loadData() {
		
		
		

		}
	
}
