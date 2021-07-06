package com.es.s2obcn.serenity.junit.reservations.services;

import com.es.s2obcn.serenity.junit.reservations.domain.Reservation;
import com.es.s2obcn.serenity.junit.reservations.pages.ReservationListPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ReservationService {
    ReservationListPage reservationListPage;

    @Step
    public void open() {
        reservationListPage.open();
    }

    @Step
    public void addReservations(Reservation givenReservations) {
        reservationListPage.addReservations(givenReservations);
    }

    @Step
    public List<Reservation> getReservationList() {
        return reservationListPage.getReservationList();
    }
}
