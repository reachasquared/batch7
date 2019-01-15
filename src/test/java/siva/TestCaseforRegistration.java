package siva;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCaseforRegistration extends global {//class begins

    @Test
    public void testCaseforRegistration(){//method begins
                // Go to newtours website
        logger.info("Go to newtours website");
        driver.get(baseUrl);
        //verify page title is "Welcome: Mercury Tours"
assertEquals("Welcome: Mercury Tours",driver.getTitle());
        //Verify REGISTER link is present
assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());
        //Click on REGISTER link
        logger.info("Click on REGISTER link");
driver.findElement(By.linkText("REGISTER")).click();
        //Enter asquared in First Name
        logger.info("Enter asquared in First Name");
driver.findElement(By.name("firstName")).clear();
driver.findElement(By.name("firstName")).sendKeys("asquared");
        //Enter asquared in Last Name
        logger.info("Enter asquared in Last Name");
driver.findElement(By.name("lastName")).clear();
driver.findElement(By.name("lastName")).sendKeys("asquared");
        //Enter 9049049044 in Phone
        logger.info("Enter 9049049044 in Phone");
driver.findElement(By.name("phone")).click();
driver.findElement(By.name("phone")).sendKeys("9049049044");
        //Select UNITED KINGDOM from Country
logger.info("Click Submit");
        //Click Submit
driver.findElement(By.name("register")).click();
        //Verify "Dear asquare asquared," text is displayed

        //verify Sign-off link exists
//assertEquals(By.ByLinkText("href="mercurysignoff.php")).;
        // Verify REGISTER image is displayed

        //click SIGN-OFF
driver.findElement(By.linkText("SIGN-OFF")).click();


    }//method ends




}//class ends
