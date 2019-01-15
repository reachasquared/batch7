package bhagyas;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_Registration extends global {
    //class begins

    @Test
    public void registration(){
     // method begins

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

        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys("9049049044");


        //Select UNITED KINGDOM from Country


        //Click Submit

        logger.info("Click on Submit");
        driver.findElement(By.name("register")).click();

        //Verify "Dear asquare asquared," text is displayed -skip this step


        //verify Sign-off link exists

        driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();

        // Verify REGISTER image is displayed - skip

        //click SIGN-OFF

        logger.info("Click on SIGN-OFF");
        driver.findElement(By.linkText("SIGN-OFF")).click();


    }// METHOD ends

}//class ends

