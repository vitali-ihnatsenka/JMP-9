package com.epam.jmp9.dao;

import com.epam.jmp9.domain.Reservation;

import java.time.LocalDate;

/**
 * Created by Vitali on 04.09.2016.
 */
public interface ReservationDao {
    void create(Reservation reservation);
    Reservation getById(String id);
    Reservation getByDate(LocalDate date);
    void remove(String id);
}
