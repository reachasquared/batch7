package asquared;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Test_NewToursRegistration {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        //driver = AsquaredWebDriverFactory.getDriver();
        driver = AsquaredWebDriverFactory.getDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void newToursRegistration() {//method begins

        // Go to newtours website
        driver.get(baseUrl);

        //verify page title is "Welcome: Mercury Tours"
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        //Verify REGISTER link is present
        assertTrue(driver.findElement(By.linkText("REGISTER"))
                .isDisplayed()
        );
        //Click on REGISTER link
        driver.findElement(By.linkText("REGISTER")).click();

        //Enter asquared in First Name
        driver.findElement(By.name("firstName"))
                .sendKeys("asquared");

        //Enter asquared in Last Name
        driver.findElement(By.name("lastName"))
                .sendKeys("asquared");

        //Enter 9049049044 in Phone
        driver.findElement(By.name("phone"))
                .sendKeys("9049049044");

        //Select UNITED KINGDOM from Country
        new Select(driver.findElement(By.name("country")))
                .selectByVisibleText("UNITED KINGDOM");

        //Click Submit
        driver.findElement(By.name("register"))
                .click();

        //Verify "Dear asquare asquared," text is displayed

        //verify Sign-off link exists
        assertTrue(driver.findElement(By.linkText("SIGN-OFF"))
                .isDisplayed());

        // Verify REGISTER image is displayed
        assertTrue(driver.findElement(
                By.cssSelector("img[src=\"/images/masts/mast_register.gif\"]"))
                .isDisplayed());

        //click SIGN-OFF
        driver.findElement(By.linkText("SIGN-OFF")).click();

    }//method ends

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}//class ends
