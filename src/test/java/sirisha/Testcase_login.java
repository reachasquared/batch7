package sirisha;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Testcase_login {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before//Junit Annotation
    public void setUp() throws Exception {//setup method begins
        //driver = new FirefoxDriver();
        driver = AsquaredWebDriverFactory.getDriver();
        //driver = new FirefoxDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }//setup method ends

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @Test
    public void loginLinks(){
        //Step 1	Go to http://newtours.demoaut.com
        driver.get(baseUrl);

        //Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        //Verify User Name and Password fields and Sign-in button exist
        driver.findElement(By.name("userName")).click();
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("login")).click();

        //Step 2	Enter asquared in user name field
        driver.findElement(By.name("userName")).sendKeys("asquared");

        //Step 3	Enter asquared in password field
        driver.findElement(By.name("password")).sendKeys("asquared");

        //Step 4	Click on Sign-in
        driver.findElement(By.name("login")).click();

        //Assert page title is Find a Flight: Mercury Tours:
        assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());

        //Step 5 Click on SIGN-OFF
        driver.findElement(By.linkText("SIGN-OFF")).click();

    }
}