package com.epam.jmp9.service;

import com.epam.jmp9.dao.ReservationDao;
import com.epam.jmp9.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by Vitali on 04.09.2016.
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationDao reservationDao;

    @Override
    public void create(Reservation reservation) {
        reservationDao.create(reservation);
    }

    @Override
    public Reservation getById(String id) {
        return reservationDao.getById(id);
    }

    @Override
    public Reservation getByDate(LocalDate date) {
        return reservationDao.getByDate(date);
    }

    @Override
    public void remove(String id) {
        reservationDao.remove(id);
    }
}
