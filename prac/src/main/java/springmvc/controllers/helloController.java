package springmvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class helloController {
	
	
	@RequestMapping("/home")
	public String getMessage(Model model) {
		
		model.addAttribute("name","Sitaram");
		return "hello";
	}

	
}
