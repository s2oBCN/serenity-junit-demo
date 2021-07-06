package com.es.s2obcn.serenity.junit.reservations.tests;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    // Si no ponemos esto, Serenity no sabe que estamos testeando web
    @Managed
    WebDriver driver;
}
