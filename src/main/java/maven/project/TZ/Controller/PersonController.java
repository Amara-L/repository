package maven.project.TZ.Controller;

import maven.project.TZ.DataPersServise;
import maven.project.TZ.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	
	@Autowired
	DataPersServise service;
	
	@RequestMapping("/summary")
    public String getEmployeeInfo(Model model) {
		
		Person pers = service.getPers();
		
		model.addAttribute("FIO",pers.getFIO());
		model.addAttribute("DOB",pers.getDOB());
		model.addAttribute("Phone",pers.getPhone());
		model.addAttribute("Email",pers.getEmail());
		model.addAttribute("Skype",pers.getSkype());
		model.addAttribute("Avatar",pers.getAvatar());
		model.addAttribute("Target",pers.getTarget());
		model.addAttribute("Experiences",pers.getExperiences());
		model.addAttribute("Educations",pers.getEducations());
		model.addAttribute("AdditionalEducations",pers.getAdditionalEducations());
		model.addAttribute("Skills",pers.getSkills());

		return "summary";
		
	}

}
