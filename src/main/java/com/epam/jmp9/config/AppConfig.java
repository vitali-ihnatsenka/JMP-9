package com.epam.jmp9.config;

import com.epam.jmp9.domain.Person;
import com.epam.jmp9.domain.Reservation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;

/**
 * Created by Vitali on 04.09.2016.
 */
@Configuration
public class AppConfig {
    private static final String PERSON_FIRST_NAME = "Ivan";
    private static final String PERSON_LAST_NAME = "Ivanov";
    private static final String DEAFULT_PLACE = "Gomel";
    private static final int DEFAULT_PRICE = 100;
    private static int currentId = 0;

    @Bean
    @Scope("prototype")
    public Person getPerson(){
        return new Person(PERSON_FIRST_NAME, PERSON_LAST_NAME);
    }

    @Bean
    @Scope("prototype")
    public Reservation getReservation(){
        Reservation reservation = new Reservation();
        reservation.setId(String.valueOf(currentId++));
        reservation.setName("Reservation_" + reservation.getId());
        reservation.setDateTime(LocalDateTime.now());
        reservation.setPlace(DEAFULT_PLACE);
        reservation.setPrice(DEFAULT_PRICE);
        reservation.setOwner(getPerson());
        return reservation;
    }
}
