package com.epam.jmp9.dao;

import com.epam.jmp9.domain.Reservation;
import org.springframework.stereotype.Repository;

/**
 * Created by Vitali on 04.09.2016.
 */
@Repository
public class ReservationDaoMemoryImpl implements ReservationDao {

    @Override
    public void create(Reservation reservation) {

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
