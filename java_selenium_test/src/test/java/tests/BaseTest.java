package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    /**
     * This method will be executed before the test start.
     */
    @BeforeMethod
    public void initialize() {
        driver = BrowserProvider.createDriver(Browser.CHROME);
        driver.manage().window().maximize();
    }


    /**
     * This method will be executed at the end of the test.
     */
    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
