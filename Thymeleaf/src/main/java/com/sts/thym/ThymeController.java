package com.sts.thym;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeController {
	
	@GetMapping("/about")
	public String aboutThymeleaf(Model model) {
		
		model.addAttribute("name","Pradeep");
		model.addAttribute("number",1);		
		List<String> l1 = List.of("Pradeep","pramod","Dilip");
		model.addAttribute("isActive",false);
		model.addAttribute("gen","F");
		
		model.addAttribute("name1",l1);
		return "about";
	}

}
