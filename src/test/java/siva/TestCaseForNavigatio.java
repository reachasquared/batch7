package siva;

import core.engine.AsquaredWebDriverFactory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseForNavigatio{
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

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
  @Test
  public void testCaseForNavigation()throws Exception {

//Step 1	Go to http://newtours.demoaut.com
        driver.get("http://newtours.demoaut.com/");
        //Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
//Step 2	Click on SIGN-ON link in Header
        driver.findElement(By.linkText("SIGN-ON")).click();
        //Assert page title : Sign-on: Mercury Tours
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());
//Step 3	Click on SUPPORT link in Header
        driver.findElement(By.linkText("SUPPORT")).click();
        //Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
//Step 4	Click on CONTACT link in Header
        driver.findElement(By.linkText("CONTACT")).click();
        //Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
//Step 5	Click on Home link in left side menu
        driver.findElement(By.linkText("Home")).click();
        //Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
//Step 6	Click on Flight link in left side menu
        driver.findElement(By.linkText("Flight")).click();
        //Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
//Step 7	Click on Hotels link in left side menu
        driver.findElement(By.linkText("Hotels")).click();
        //Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
//Step 8	Click on Car Rentals link in left side menu
        driver.findElement(By.linkText("Car Rentals")).click();
        //Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
//Step 9	Click on Cruises link in left side menu
        driver.findElement(By.linkText("Cruises")).click();
        //Assert page title : Cruises: Mercury Tours
        assertEquals("Cruises: Mercury Tours", driver.getTitle());
//Step 10	Click on Destinations link in left side menu
        driver.findElement(By.linkText("Destinations")).click();
        //Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
//Step 11	Click on Vacations link in left side menu
        driver.findElement(By.linkText("Vacations")).click();
        //Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
    }






















}//end class
