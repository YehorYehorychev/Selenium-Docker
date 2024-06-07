package com.yehorychev.pages.flightreservation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    @FindBy(id = "firstName")
    private WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "[placeholder='1234 Main St']")
    private WebElement street;

    @FindBy(css = "input[name='city']")
    private WebElement city;

    @FindBy(css = "#inputState")
    private WebElement stateDropDown;

    @FindBy(css = "option[value='California']")
    private WebElement state;

    @FindBy(css = "input[name='zip']")
    private WebElement zip;
}
