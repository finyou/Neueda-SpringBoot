package uk.ac.belfastmet.dwarfs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping("/tolkienPage")

public class TolkienController {
	
	@Autowired
	private DwarfService dwarfService;

	@GetMapping("")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle","Tolkien!");
		this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs", this.dwarfService.getTolkienDwarves());
		return "tolkienPage";
	}
	

}

