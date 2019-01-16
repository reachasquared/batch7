package Bhavya;

import core.engine.AsquaredWebDriverFactory;
import core.engine.global;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.basic.BasicTextUI;

import static org.junit.Assert.*;

public class Test_Registration extends global {


@Test
    public void registration(){//registration method begins
    // Go to newtours website
    logger.info("Go to newtours website");
    driver.get(baseUrl);

    //verify page title is "Welcome: Mercury Tours"
    assertEquals("Welcome: Mercury Tours",driver.getTitle());

    //Verify REGISTER link is present
    assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());

    //Click on REGISTER link
    logger.info("Click on REGISTER");
    driver.findElement(By.linkText("REGISTER")).click();
    //Enter asquared in First Name(firstName)
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("asquared");
    //Enter asquared in Last Name(lastName)
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("asquared");
    //Enter 9049049044 in Phone(phone)
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("9049049044");
    //Select UNITED KINGDOM from Country(country)

    new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED KINGDOM");

    //Click Submit
driver.findElement(By.name("register")).click();

//Verify "Dear asquare asquared," text is displayed

    try {
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Dear asquared asquared,[\\s\\S]*$"));
    } catch (Error e) {
        verificationErrors.append(e.toString());
    }

    //verify Sign-off link exists
    assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());

    
    // Verify REGISTER image is displayed
    //assertTrue(driver.findElement(By.id("/images/masts/mast_register")).isDisplayed());

   //  driver.findElement(By.xpath("/images/masts/mast_register.gif"));

    //click SIGN-OFF

   driver.findElement(By.linkText("SIGN-OFF")).click();

}//method ends
}//class ends
