package com.epam.jmp9.controller;

import com.epam.jmp9.domain.Person;
import com.epam.jmp9.domain.Reservation;
import com.epam.jmp9.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
        reservation.setName(name);
        reservation.setDateTime(LocalDateTime.parse(datetime));
        reservation.setPlace(place);
        reservation.setPrice(price);
        reservation.setOwner(new Person(firstName, lastName));
        reservationService.create(reservation);
        model.addAttribute("message", "Reservation has been created");
        return "message";
    }

    @RequestMapping("searchById")
    public String searchById(ModelMap model, @RequestParam String id){
        Reservation reservation = reservationService.getById(id);
        if(reservation == null){
            model.addAttribute("message", "Reservation " + id + " not found");
            return "message";
        }
        model.addAttribute("reservations", Arrays.asList(reservation));
        return "search";
    }

    @RequestMapping("remove")
    public String remove(ModelMap model, @RequestParam String id){
        reservationService.remove(id);
        model.addAttribute("message", "Reservation " + id + " has been removed");
        return "message";
    }

    @RequestMapping("searchByDate")
    public String searchByDate(ModelMap model, @RequestParam String date){
        List<Reservation> reservations = reservationService.getByDate(LocalDate.parse(date));
        if(reservations == null || reservations.isEmpty()){
            model.addAttribute("message", "There is no reservations for " + date);
            return "message";
        }
        model.addAttribute("reservations", reservations);
        return "search";
    }
}