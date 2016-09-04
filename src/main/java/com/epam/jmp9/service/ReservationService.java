package com.epam.jmp9.service;

import com.epam.jmp9.domain.Reservation;

/**
 * Created by Vitali on 04.09.2016.
 */
public interface ReservationService {
    void create(Reservation reservation);
    Reservation getById(String id);
    Reservation getByName(String name);
    void remove(String id);
}
