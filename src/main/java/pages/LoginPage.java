package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");

    private By invalidCredentialsMessage =
            By.cssSelector(".oxd-alert-content-text");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    // Actions


    public void waitForLoginPageToLoad() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameField)
        );
    }
    public void enterUsername(String Username) {
        driver.findElement(usernameField).sendKeys(Username);
    }

    public void enterPassword(String Password) {
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getInvalidCredentialsMessage() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        invalidCredentialsMessage
                )
        ).getText();
    }
}