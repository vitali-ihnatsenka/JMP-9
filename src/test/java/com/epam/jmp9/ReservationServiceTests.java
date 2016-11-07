package com.epam.jmp9;

import com.epam.jmp9.dao.ReservationDao;
import com.epam.jmp9.domain.Reservation;
import com.epam.jmp9.service.ReservationService;
import com.epam.jmp9.service.ReservationServiceImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ReservationServiceTests {
    private static final String id ="1";

    @InjectMocks
    private ReservationService reservationService = new ReservationServiceImpl();

    @Mock
    private ReservationDao reservationDao;

    @Test
    public void testCreate_shouldInvokeCreateFromDao () {
        Reservation reservation = mock(Reservation.class);
        reservationService.create(reservation);
        verify(reservationDao, times(1)).create(reservation);
    }

    @Test
    public void testGetById_shouldReturnReservationFromDao () {
        Reservation reservation = mock(Reservation.class);
        when(reservationDao.getById(id)).thenReturn(reservation);
        assertEquals(reservation, reservationService.getById(id));
    }

    @Test
    public void testGetByDate_shouldReturnReservationFromDao () {
        final LocalDate date = LocalDate.now();
        List<Reservation> reservations = mock(ArrayList.class);
        when(reservationDao.getByDate(date)).thenReturn(reservations);
        assertEquals(reservations, reservationService.getByDate(date));
    }

    @Test
    public void testRemove_shouldInvokeRemoveFromDao () {
        reservationService.remove(id);
        verify(reservationDao, times(1)).remove(id);
    }
}
