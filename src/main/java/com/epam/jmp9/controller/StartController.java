package com.epam.jmp9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class StartController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "start";
	}

    @RequestMapping("create")
    public String create(ModelMap model,
                         @RequestParam String name,
                         @RequestParam String datetime,
                         @RequestParam String place,
                         @RequestParam int price,
                         @RequestParam String firstName,
                         @RequestParam String lastName){
        model.addAttribute("message", "Reservation has been created");
        return "message";
    }
}