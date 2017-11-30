package uk.ac.belfastmet.largestBuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestBuildings.service.buildingsService;

@Controller
@RequestMapping("/volumePage")

public class usableVolumeController {
			
			@Autowired
			private buildingsService buildingsService;
			
			@GetMapping("")
			public String largestVolume(Model model) {
				model.addAttribute("pageTitle","Largest Usable Volume!");
				this.buildingsService = new buildingsService();
				model.addAttribute("Buildings", this.buildingsService.getVolumeBuilding());
				return "volumePage";
			}
			

		}
