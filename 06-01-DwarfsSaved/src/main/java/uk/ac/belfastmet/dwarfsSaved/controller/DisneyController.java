package uk.ac.belfastmet.dwarfsSaved.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfsSaved.domain.Dwarf;
import uk.ac.belfastmet.dwarfsSaved.repositories.DwarfRepository;


@Controller
@RequestMapping("/disneyPage")

public class DisneyController {
	
	@Autowired
	DwarfRepository dwarfRepository;
	
	
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("")
	public String disney(Model model) {
		model.addAttribute("pageTitle","Disney!");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthorOrName("Disney", "Thorin"));
		return "disneyPage";
	}
	

}
