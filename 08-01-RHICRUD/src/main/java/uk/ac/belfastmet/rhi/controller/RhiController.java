package uk.ac.belfastmet.rhi.controller;


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

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.repositories.RhiRepository;


@Controller
@RequestMapping("/rhiPage")

public class RhiController {
	
	@Autowired
	RhiRepository rhiRepository;
	
	
	
	public RhiController(RhiRepository rhiRepository) {
		super();
		this.rhiRepository = rhiRepository;
	}

	@GetMapping("")
	public String allRhi(Model model) {
	model.addAttribute("pageTitle", "All Participants");
	model.addAttribute("rhis", rhiRepository.findAll());
		return "rhiPage";
	}
	@PostMapping("/search")
	public String viewPage(@RequestParam("name") String name, Model model) {
	model.addAttribute("pageTitle", "Search Result");
	model.addAttribute("rhis", rhiRepository.findByNameContaining(name));
		return "rhiSearch";
	}
	@GetMapping("/rhi/view/{rhiId}")
	public String viewPage(@PathVariable("rhiId") Integer rhiId, Model model) {
		model.addAttribute("pageTitle", "View Participant");
		model.addAttribute("rhis", rhiRepository.findOne(rhiId));
		return "viewPage";
	}
	@GetMapping("rhi/Edit/{rhiId}")
	public String editPage(@PathVariable("rhiId") Integer rhiId, Model model) {
		model.addAttribute("pageTitle", "Edit Participant");
		model.addAttribute("rhi", rhiRepository.findOne(rhiId));
		return "editPage";
	}
	@GetMapping("/rhi/add")
	public String createRhi(Model model) {
		model.addAttribute("page title", "Add Participant");
		model.addAttribute("rhis", new Rhi());
		return "editPage";
	}
	@GetMapping("/rhi/Delete/{rhiId}")
	public String deleteRhi(@PathVariable("rhiId") Integer rhiId, RedirectAttributes redirectAtt) {
		rhiRepository.delete(rhiId);
		redirectAtt.addFlashAttribute("message", "Particpant Successfully Deleted!");
		return "redirect:/";
	}
	@PostMapping("/rhi/save")
	public String saveRhi(@Valid Rhi rhi, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "editPage";
			
		}else {
			
		Rhi savedRhi = rhiRepository.save(rhi);
		return "redirect:/rhiPage/rhi/view/" + savedRhi.getRhiId();
		}
	}
	
	

}
