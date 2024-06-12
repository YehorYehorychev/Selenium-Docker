package com.yehorychev.tests.flightreservation;

import com.yehorychev.pages.flightreservation.FlightsSearchPage;
import com.yehorychev.pages.flightreservation.RegistrationConfirmationPage;
import com.yehorychev.pages.flightreservation.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightReservationTest {

    private WebDriver driver;

    @Test
    public void userRegistrationTest() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.goTo("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html");
        Assert.assertTrue(registrationPage.isAt());

        registrationPage.enterUserDetails("Selenium", "Docker");
        registrationPage.enterUserCredentials("user@docker.com", "admin");
        registrationPage.enterAddress("1234 Main Street", "San Francisco", "94223");
        registrationPage.register();
    }

    @Test(dependsOnMethods = "userRegistrationTest")
    public void registrationConfirmationTest() {
        RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage(driver);
        Assert.assertTrue(registrationConfirmationPage.isAt());

        registrationConfirmationPage.goToFlightsSearch();
    }

    @Test(dependsOnMethods = "registrationConfirmationTest")
    public void flightSearchTest() {
        FlightsSearchPage flightsSearchPage = new FlightsSearchPage(driver);
        Assert.assertTrue(flightsSearchPage.isAt());

        flightsSearchPage.selectPassengers("2");
        flightsSearchPage.searchForFlight();
    }
}
