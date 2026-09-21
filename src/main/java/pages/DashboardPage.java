package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private WebDriver driver;

    private By dashboardHeading =
            By.xpath("//h6[text()='Dashboard']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardDisplayed() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(dashboardHeading)
        ).isDisplayed();
    }
}