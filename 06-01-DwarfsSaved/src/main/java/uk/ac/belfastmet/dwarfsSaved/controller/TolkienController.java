package uk.ac.belfastmet.dwarfsSaved.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfsSaved.domain.Dwarf;

import uk.ac.belfastmet.dwarfsSaved.repositories.DwarfRepository;


@Controller
@RequestMapping("/tolkienPage")

public class TolkienController {
	
	@Autowired
	DwarfRepository dwarfRepository;
	
	

	public TolkienController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle","Tolkien!");
		model.addAttribute("dwarfs", dwarfRepository.findByDwarfId(18));
		return "tolkienPage";
	}

}

