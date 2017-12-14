package uk.ac.belfastmet.rhi.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.rhi.repositories.RhiRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	

	@GetMapping("/")
	public String homePage (Model model) {
		return "homePage";
	}

	@RequestMapping(value="/rhiPage")
	public String goToRhiPage() {
		return "rhiPage";
	}

}


