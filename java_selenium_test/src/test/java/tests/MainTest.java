package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MainTest {
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
     * Your test
     */
    @Test
    public void googleTest() {
        String expectedTitle = "Google";
        driver.get("https://www.google.com/");
        Assert.assertEquals(
                driver.getTitle(),
                expectedTitle,
                String.format("Window title should be contains: %s", expectedTitle)
        );
    }

    /**
     * This method will be executed at the end of the test.
     */
    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}
