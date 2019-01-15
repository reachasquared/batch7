package bhagyas;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class landingpage {
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

  @Test
  public void testLandingpage() throws Exception {
    //method begins
    driver.get(baseUrl + "/");
    // verify the page title: "Welcome Mercury Tours"
    assertEquals("Welcome: Mercury Tours", driver.getTitle());

    // verify  the image "Mercury Tours" is present
    assertTrue(isElementPresent(By.cssSelector("img[alt=\"Mercury Tours\"]")));

    assertTrue(isElementPresent(By.cssSelector("td > img")));

    // verify the link "SIGN-ON" is present
    assertTrue(isElementPresent(By.linkText("SIGN-ON")));

    // verify the link "REGISTER" is present
    assertTrue(isElementPresent(By.linkText("REGISTER")));

    // verify the link "SUPPORT" is present
    assertTrue(isElementPresent(By.linkText("SUPPORT")));

    //verify the link "CONTACT" is present
    assertTrue(isElementPresent(By.linkText("CONTACT")));

    // verify "User Name" label is present
    assertEquals("User Name:", driver.findElement(By.xpath("//tr[4]/td/table/tbody/tr[2]/td/font")).getText());

    // verify for username input box
    assertTrue(isElementPresent(By.name("userName")));

    // verify "password" label is present
    assertEquals("Password:", driver.findElement(By.xpath("//tr[4]/td/table/tbody/tr[3]/td/font")).getText());

    // verify for password input box
    assertTrue(isElementPresent(By.name("password")));

    // verify  "login"  link is present
    assertTrue(isElementPresent(By.name("login")));

    //verify
    assertTrue(isElementPresent(By.cssSelector("img[alt=\"Desinations\"]")));
    assertTrue(isElementPresent(By.cssSelector("img[alt=\"vacations\"]")));
    assertTrue(isElementPresent(By.cssSelector("img[alt=\"Register\"]")));
    assertTrue(isElementPresent(By.cssSelector("img[alt=\"Links\"]")));

    //
    assertEquals("Atlanta to Las Vegas", driver.findElement(By.xpath("//tr[3]/td/table/tbody/tr/td/font")).getText());
    assertEquals("$398", driver.findElement(By.cssSelector("b")).getText());
  } // method ends

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
 }//Class ends
