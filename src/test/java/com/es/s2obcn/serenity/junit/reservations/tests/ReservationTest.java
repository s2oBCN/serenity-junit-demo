package com.es.s2obcn.serenity.junit.reservations.tests;

import com.es.s2obcn.serenity.junit.reservations.domain.Reservation;
import com.es.s2obcn.serenity.junit.reservations.domain.ReservationDataBuilder;
import com.es.s2obcn.serenity.junit.reservations.services.ReservationService;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class ReservationTest extends BaseTest {
    @Steps
    ReservationService reservationService;

    @Test
    public void addingReservations() {
        // Given
        Reservation givenReservations = ReservationDataBuilder.defaultReservation().build();
        reservationService.open();

        // When
        reservationService.addReservations(givenReservations);

        // Then
        assertThat(reservationService.getReservationList())
                .as("Reservation list")
                .usingFieldByFieldElementComparator()
                .containsExactlyElementsOf(List.of(givenReservations));
    }
}
