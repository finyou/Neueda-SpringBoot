package uk.ac.belfastmet.dwarfsSaved.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")
	public String dwarfPage(Model model) {

		return "index";
	}
	@RequestMapping(value="/disneyPage")
	public String goToDisneyPage() {
		return "disneyPage";
	}
	@RequestMapping(value="/tolkienPage")
	public String goToTolkienPage() {
		return "tolkienPage";
	}
}


