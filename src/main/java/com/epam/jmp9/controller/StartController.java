package com.epam.jmp9.controller;

import com.epam.jmp9.domain.Reservation;
import com.epam.jmp9.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class StartController {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private ReservationService reservationService;

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
        Reservation reservation = appContext.getBean(Reservation.class);
        reservationService.create(reservation);
        model.addAttribute("message", "Reservation has been created");
        return "message";
    }
}