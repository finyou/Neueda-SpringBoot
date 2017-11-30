package uk.ac.belfastmet.largestBuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestBuildings.service.buildingsService;

@Controller
@RequestMapping("/floorPage")

public class floorAreaController {
	
	@Autowired
	private buildingsService buildingsService;
	
	@GetMapping("")
	public String largestFloor(Model model) {
		model.addAttribute("pageTitle","Largest Floor Area!");
		this.buildingsService = new buildingsService();
		model.addAttribute("Buildings", this.buildingsService.getFloorBuilding());
		return "floorPage";
	}
	

}
