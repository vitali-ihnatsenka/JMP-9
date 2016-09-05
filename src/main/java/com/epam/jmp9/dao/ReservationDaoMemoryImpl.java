package com.epam.jmp9.dao;

import com.epam.jmp9.domain.Reservation;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vitali on 04.09.2016.
 */
@Repository
public class ReservationDaoMemoryImpl implements ReservationDao {
    private List<Reservation> reservations = new ArrayList<>();

    @Override
    public void create(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public Reservation getById(String id) {
        return reservations.stream().filter((r)->r.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<Reservation> getByDate(LocalDate date) {
        return reservations.stream()
                .filter((r) -> r.getDateTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
    }

    @Override
    public void remove(String id) {
        reservations.removeIf(i->i.getId().equals(id));
    }
}
