package uk.ac.belfastmet.largestBuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.buildings.domain.Building;
import uk.ac.belfastmet.largestBuildings.service.buildingsService;

@Controller
@RequestMapping("/footprintPage")

public class footprintController {
		
		@Autowired
		private buildingsService buildingsService;
		
		@GetMapping("")
		public String largestFootprint(Model model) {
			model.addAttribute("pageTitle","Largest Footprint!");
			this.buildingsService = new buildingsService();
			model.addAttribute("Buildings", this.buildingsService.getFootprintBuilding());
			return "footprintPage";
		}
		

	}
