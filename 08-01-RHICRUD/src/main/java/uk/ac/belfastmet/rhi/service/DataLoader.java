package uk.ac.belfastmet.rhi.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.repositories.RhiRepository;

@Service
public class DataLoader {

	@Autowired
	private RhiRepository rhiRepository;
	
	public DataLoader(RhiRepository rhiRepository) {
		super();
		this.rhiRepository = rhiRepository;
	}

	
	public void loadData() {
		
		
		

		}
	
}
