package uk.ac.belfastmet.top10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.top10.service.top10service;

@Controller
@RequestMapping("/top10")

public class top10controller {
	
	@Autowired
	private top10service top10Service;
	
	@GetMapping("")
	public String top10(Model model) {
		model.addAttribute("pageTitle","Largest Floor Area!");
		this.top10Service = new top10service();
		model.addAttribute("Top10", this.top10Service.getTop10());
		return "top10";
	}
	

}