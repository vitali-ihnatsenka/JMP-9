package com.epam.jmp9.service;

import com.epam.jmp9.domain.Reservation;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Vitali on 04.09.2016.
 */
public interface ReservationService {
    void create(Reservation reservation);
    Reservation getById(String id);
    List<Reservation> getByDate(LocalDate date);
    void remove(String id);
}
