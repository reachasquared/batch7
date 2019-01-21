package sirisha;

import core.engine.AsquaredWebDriverFactory;
import core.engine.global;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Test_Registration extends global {

        @Test

                public void registration(){

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
            driver.findElement(By.name("firstName")).clear();
            driver.findElement(By.name("firstName")).sendKeys("asquared");

            //Enter asquared in Last Name
            driver.findElement(By.name("lastName")).clear();
            driver.findElement(By.name("lastName")).sendKeys("asquared");

            //Enter 9049049044 in Phone
            driver.findElement(By.name("phone")).sendKeys("asquared");

            //Select UNITED KINGDOM from Country
            new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED KINGDOM");

            //Click Submit
            logger.info("Click on Submit link");
            driver.findElement(By.name("register")).click();

            //verify Sign-off link exists
            assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());


            //click SIGN-OFF
            logger.info("Click on SIGN-OFF link");
            driver.findElement(By.linkText("SIGN-OFF")).click();



        }//method ends
}//class ends
