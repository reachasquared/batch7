package bhagyas;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Test_VerifyLinks {
    // class begins

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        driver = AsquaredWebDriverFactory.getDriver();
        baseUrl = "http://www.newtours.demoaut.com/";
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

    public void verifyLinks() {
      // method begins

    // Goto http://newtours.demoaut.com

    driver.get(baseUrl);

    //verify page titla is"Welcome: Mercury Tours"

    assertEquals("Welcome: Mercury Tours",driver.getTitle());

    //Verify Home link exists

    assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());


    // verify Flights link exists

    assertTrue(driver.findElement(By.linkText("Flights")).isDisplayed());

    // Verify Hotels link exists

    assertTrue(driver.findElement(By.linkText("Hotels")).isDisplayed());

    // verify Car Link exists

    assertTrue(driver.findElement(By.linkText("Car Rentals")).isDisplayed());

    // verify Cruises Link exists

    assertTrue(driver.findElement(By.linkText("Cruises")).isDisplayed());



}


} // class ends
