package com.epam.jmp9.service;

import com.epam.jmp9.dao.ReservationDao;
import com.epam.jmp9.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public Reservation getByName(String name) {
        return null;
    }

    @Override
    public void remove(String id) {

    }
}
