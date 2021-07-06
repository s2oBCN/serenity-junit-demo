package com.es.s2obcn.serenity.junit.reservations.domain;

public class ReservationDataBuilder {
    public static Reservation.ReservationBuilder defaultReservation(){
        return Reservation.builder()
                .name("pepe")
                .phone("88768")
                .email("a@es.es")
                .date("2017-02-17")
                .number("8")
                .time("12:00")
                .color("#4e2727");
    }
}
