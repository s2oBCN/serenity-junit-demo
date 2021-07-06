package com.es.s2obcn.serenity.junit.reservations.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Reservation {
    private String name;
    private String phone;
    private String email;
    private String date;
    private String number;
    private String time;
    private String color;
}
