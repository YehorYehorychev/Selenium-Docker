package com.yehorychev.pages.flightreservation;

import com.yehorychev.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightsSelectionPage extends AbstractPage {
    @FindBy(name = "departure-flight")
    private List<WebElement> departureFlightsOptions;


    public FlightsSelectionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        return false;
    }
}
