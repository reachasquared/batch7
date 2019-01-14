package asquared;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Test_VerifyLinks {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        driver = AsquaredWebDriverFactory.getDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void verifyLinks(){
        // Go to http://newtours.demoaut.com/
        driver.get(baseUrl);

        // Verify webpage loads

        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        // Verify Home link exist
        assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());

        assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());

        // Verify Flights link exist
        assertTrue(driver.findElement(By.linkText("Flights")).isDisplayed());

        // Verify Hotels link exist
        assertTrue(driver.findElement(By.linkText("Hotels")).isDisplayed());

        //Verify Cars link exist
        assertTrue(driver.findElement(By.linkText("Car Rentals")).isDisplayed());

        // Verify Cruises link exist
        assertTrue(driver.findElement(By.linkText("Cruises")).isDisplayed());

        //Step 2	Click on SIGN-ON link in Header
driver.findElement(By.linkText("SIGN-ON")).click();


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
