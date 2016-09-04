package com.epam.jmp9.dao;

import com.epam.jmp9.domain.Reservation;

/**
 * Created by Vitali on 04.09.2016.
 */
public interface ReservationDao {
    void create(Reservation reservation);
    Reservation getById(String id);
    Reservation getByName(String name);
    void remove(String id);
}
