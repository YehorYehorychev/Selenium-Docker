package com.yehorychev.tests.vendorportal;

import com.yehorychev.pages.vendorportal.DashboardPage;
import com.yehorychev.pages.vendorportal.LoginPage;
import com.yehorychev.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VendorPortalTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @BeforeTest
    public void setPageObjects() {
        this.loginPage = new LoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.goTo("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/index.html");
        Assert.assertTrue(loginPage.isAt());
        loginPage.login("sam", "sam");
    }

    @Test(dependsOnMethods = "loginTest")
    public void dashboardTest() {
        Assert.assertTrue(dashboardPage.isAt());
        Assert.assertEquals(dashboardPage.getMonthlyEarning(), "$40,000");
        Assert.assertEquals(dashboardPage.getAnnualEarning(), "$215,000");
        Assert.assertEquals(dashboardPage.getProfitMargin(), "50%");
        Assert.assertEquals(dashboardPage.getAvailableInventory(), "18");

        dashboardPage.searchOrderHistoryBy("adams");
        Assert.assertEquals(dashboardPage.getSearchResultsCount(), 8);
    }

    @Test(dependsOnMethods = "dashboardTest")
    public void logoutTest() {
        dashboardPage.logout();
        Assert.assertTrue(loginPage.isAt());
    }
}
