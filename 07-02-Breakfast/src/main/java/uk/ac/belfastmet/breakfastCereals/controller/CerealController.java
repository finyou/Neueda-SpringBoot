package uk.ac.belfastmet.breakfastCereals.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import uk.ac.belfastmet.breakfastCereals.repositories.CerealRepository;


@Controller
@RequestMapping("/cerealPage")

public class CerealController {
	
	@Autowired
	CerealRepository cerealRepository;
	
	
	
	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}

	@GetMapping("")
	public String allCereals(Model model) {
	model.addAttribute("pageTitle", "All Cereals");
	model.addAttribute("cereals", cerealRepository.findAll());
		return "cerealPage";
	}


}
