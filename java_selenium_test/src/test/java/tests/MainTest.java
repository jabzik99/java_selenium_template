package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    /**
     * Your test
     */
    @Test
    public void googleTest() {
        String expectedTitle = "Google";
        getDriver().get("https://www.google.com/");
        Assert.assertEquals(
                getDriver().getTitle(),
                expectedTitle,
                String.format("Window title should be contains: %s", expectedTitle)
        );
    }
}
