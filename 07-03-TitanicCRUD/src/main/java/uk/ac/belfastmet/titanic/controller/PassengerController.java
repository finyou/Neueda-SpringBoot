package uk.ac.belfastmet.titanic.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repositories.PassengerRepository;


@Controller
@RequestMapping("/passengerPage")

public class PassengerController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("")
	public String allPassengers(Model model) {
	model.addAttribute("pageTitle", "All Titanic Passengers");
	model.addAttribute("passengers", passengerRepository.findAll());
		return "passengerPage";
	}
	@PostMapping("/search")
	public String viewPage(@RequestParam("name") String name, Model model) {
	model.addAttribute("pageTitle", "Search Result");
	model.addAttribute("passengers", passengerRepository.findByNameContaining(name));
		return "passengerSearch";
	}
	@GetMapping("/passenger/view/{passengerId}")
	public String viewPage(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "viewPage";
	}
	@GetMapping("passenger/Edit/{passengerId}")
	public String editPage(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "editPage";
	}
	@GetMapping("/passenger/add")
	public String createPassenger(Model model) {
		model.addAttribute("page title", "Add Passenger");
		model.addAttribute("passenger", new Passenger());
		return "editPage";
	}
	@GetMapping("/passenger/Delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, RedirectAttributes redirectAtt) {
		passengerRepository.delete(passengerId);
		redirectAtt.addFlashAttribute("message", "Passenger Successfully Deleted!");
		return "redirect:/";
	}
	@PostMapping("/passenger/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "editPage";
			
		}else {
			
		Passenger savedPassenger = passengerRepository.save(passenger);
		return "redirect:/passengerPage/passenger/view/" + savedPassenger.getPassengerId();
		}
	}
	
	

}
