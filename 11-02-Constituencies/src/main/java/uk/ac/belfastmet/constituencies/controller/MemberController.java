package uk.ac.belfastmet.constituencies.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.client.RestTemplate;


import uk.ac.belfastmet.constituencies.domain.AllMembersList;
import uk.ac.belfastmet.constituencies.domain.ConstituencyJsonResponse;




@Controller
@RequestMapping("")

public class MemberController {

		@Value("${api.baseMembersUrl}")
		private String baseMembersUrl;
			
		public MemberController() {
			super();
		}
		
		@GetMapping("/")
		public String home(Model model) {
			model.addAttribute("pageTitle", "Members");

			return "homePage";
		}	
		
		@GetMapping("/SelectedMembers/{constituencyId}")
		public String selectedMembers(@PathVariable String constituencyId, Model model) {
			model.addAttribute("pageTitle", "Selected Member");
			String belfastMembersURL=this.baseMembersUrl +constituencyId;
			RestTemplate restTemplate = new RestTemplate();
			ConstituencyJsonResponse constituencyJsonResponse = restTemplate.getForObject(belfastMembersURL, ConstituencyJsonResponse.class);
			AllMembersList allMembersList = constituencyJsonResponse.getAllMembersList();
			model.addAttribute("members", allMembersList.getMembers());

			return "viewPage";
			
			
		}
		
}





