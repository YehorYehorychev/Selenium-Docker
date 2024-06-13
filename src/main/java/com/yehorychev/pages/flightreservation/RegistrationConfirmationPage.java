package com.yehorychev.pages.flightreservation;

import com.yehorychev.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationConfirmationPage extends BasePage {
    @FindBy(id = "go-to-flights-search")
    private WebElement goToFlightsSearchButton;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.goToFlightsSearchButton));
        return this.goToFlightsSearchButton.isDisplayed();
    }

    public void goToFlightsSearch() {
        this.goToFlightsSearchButton.click();
    }
}
