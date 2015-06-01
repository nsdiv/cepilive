package com.cepi.mvc;

import com.cepi.data.IndividualTEntity;
import com.cepi.data.repo.IndividualTService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");

        IndividualTService service = new IndividualTService();
        IndividualTEntity entity = service.getIndividualT("susan@baurmann.net");
		return "hello";
	}
}