package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.waitForLoginPageToLoad();

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        DashboardPage dashboardPage =
                new DashboardPage(driver);

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard was not displayed after login"
        );
    }

    @Test
    public void verifyInvalidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.waitForLoginPageToLoad();

        loginPage.enterUsername("WrongAdmin");
        loginPage.enterPassword("WrongPassword");
        loginPage.clickLogin();

        String actualMessage =
                loginPage.getInvalidCredentialsMessage();

        Assert.assertEquals(
                actualMessage,
                "Invalid credentials",
                "Incorrect error message was displayed"
        );
    }
}