package uk.ac.belfastmet.breakfastCereals.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastCereals.domain.Cereal;
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
	
	@GetMapping("/cereal/view/{cerealID}")
	public String viewPage(@PathVariable("cerealID") Integer cerealID, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealID));
		return "viewPage";
	}
	
	@GetMapping("cereal/edit/{cerealID}")
	public String editCereal(@PathVariable("cerealID") Integer cerealID, Model model) {
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealID));
		return "editPage";
	}
	
	@GetMapping("/cereal/add")
	public String createCereal(Model model) {
		model.addAttribute("page title", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editPage";
	}
	
	@GetMapping("/cereal/delete/{cerealID}")
	public String deleteCereal(@PathVariable("cerealID") Integer cerealID) {
		cerealRepository.delete(cerealID);
		return "redirect:/";
	}
	
	@PostMapping("/cereal/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "editPage";
			
		}else {
			
		Cereal savedCereal = cerealRepository.save(cereal);
		return "redirect:/cerealPage/cereal/view/" + savedCereal.getCerealID();
		}
	}
	



}
