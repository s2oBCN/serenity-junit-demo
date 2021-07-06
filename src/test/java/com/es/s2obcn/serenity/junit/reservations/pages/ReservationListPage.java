package com.es.s2obcn.serenity.junit.reservations.pages;

import com.es.s2obcn.serenity.junit.reservations.domain.Reservation;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static net.thucydides.core.pages.components.HtmlTable.inTable;

@DefaultUrl("https://s2obcn.github.io/reservationList.html")
public class ReservationListPage extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private ReservationPage reservationPage;

    private WebElementFacade tblList;
    private WebElementFacade btnAdd;

    public void addReservations(Reservation reservation) {
        btnAdd.click();
        reservationPage.registerReservation(reservation);
    }

    public List<Reservation> getReservationList() {
        LOGGER.debug("getReservationList starts");

        List<Map<Object, String>> rows = inTable(tblList).getRows();
        List<Reservation> reservations = rows.stream().map(this::mapReservation).collect(Collectors.toList());
        return reservations;
    }

    private Reservation mapReservation(Map<Object, String> rowMap) {
        return Reservation.builder()
                .name(rowMap.get("Name"))
                .phone(rowMap.get("Phone"))
                .email(rowMap.get("Email"))
                .date(rowMap.get("Date"))
                .number(rowMap.get("Number"))
                .time(rowMap.get("Time"))
                .color(rowMap.get("Table"))
                .build();
    }
}
