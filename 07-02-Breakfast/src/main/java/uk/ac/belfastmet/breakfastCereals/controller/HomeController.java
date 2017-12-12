package uk.ac.belfastmet.breakfastCereals.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastCereals.repositories.CerealRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	

	@GetMapping("/")
	public String homePage (Model model) {
		return "homePage";
	}

	@RequestMapping(value="/cerealPage")
	public String goToCerealPage() {
		return "cerealPage";
	}
	

}


