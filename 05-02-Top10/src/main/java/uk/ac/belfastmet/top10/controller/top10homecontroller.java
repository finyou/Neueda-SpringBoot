package uk.ac.belfastmet.top10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class top10homecontroller {

	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}

}