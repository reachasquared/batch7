package Bhavya;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Test_VerifyLinks {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        driver = AsquaredWebDriverFactory.getDriver();
        baseUrl = "https://newtours.demoaut.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }
    @Test
    public void verifyLinks(){
        // Go to http://newtours.demoaut.com/
driver.get("http://newtours.demoaut.com");
// Verify page title is "Welcome: Mercury Tours"
assertEquals("Welcome: Mercury Tours",driver.getTitle());
// Verify Home link exist
assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
// Verify Flights link exist
assertTrue(driver.findElement(By.linkText("Flights")).isDisplayed());
// Verify Hotels link exist
        assertTrue(driver.findElement(By.linkText("Hotels")).isDisplayed());
//Verify Car Rentals link exist
        assertTrue(driver.findElement(By.linkText("Car Rentals")).isDisplayed());
// Verify Cruises link exist
        assertTrue(driver.findElement(By.linkText("Cruises")).isDisplayed());

    }
}
