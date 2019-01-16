package ShantaR;

import core.engine.global;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Test_Registration extends global {


    @Test

    public void VerifyRegistration() {

        // Go to http://newtours.demoaut.com/
        logger.info("Go to http://newtours.demoaut.com");
        driver.get(baseUrl);

        //verify page title is "Welcome: Mercury Tours"
        logger.info("\"Welcome: Mercury Tours\"");
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        //Verify REGISTER link is present
        logger.info("REGISTER");
        assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());


        //Click on REGISTER link
        logger.info("Click on REGISTER link");
        driver.findElement(By.linkText("REGISTER")).click();
        logger.info("firstName");
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("asquared");


        //Enter asquared in Last Name
        logger.info("lastName");
        driver.findElement(By.name("lastName")).click();
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("asquared");
        //Enter 9049049044 in Phone
        logger.info("Phone");
        driver.findElement(By.name("phone")).click();
        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys("9049049044");

        //Select UNITED KINGDOM from Country
        logger.info("country");
        driver.findElement(By.name("country")).click();
        driver.findElement(By.name("country")).sendKeys("UNITED KINGDOM");
        driver.findElement(By.name("country")).click();

        //Click Submit
        logger.info("rigister");
        driver.findElement(By.name("register")).click();



        //Verify "Dear asquared asquared" text is displayed


        //verify Sign-off link exists
        logger.info("SIGN-OFF");
        assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());



        // Verify REGISTER image is displayed
        logger.info("REGISTER");
        assertTrue(driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif']")).isDisplayed());


        //click SIGN-OFF
        logger.info("SIGN-OFF");
        driver.findElement(By.linkText("SIGN-OFF")).click();


    }
}/* class ends// */