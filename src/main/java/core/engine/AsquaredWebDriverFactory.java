package core.engine;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AsquaredWebDriverFactory {

    private static Logger LOGGER = LogManager.getLogger("EngineRunLog");
    private static browser currentBrowser;
    private static Integer timeout;
    private static AsquaredEventFiringWebDriver driver;


    /**
     * Method starting WebDriver.
     * <p>
     * wiki reference for DesiredCapabilities:
     * http://code.google.com/p/selenium/wiki/DesiredCapabilities
     *
     * @return
     */
    public static WebDriver startDriver() {
        WebDriver driver = startDriver(true);
        return driver;
    }

    /**
     * Method starting WebDriver.     *
     *
     * @param deleteCookies param used for decision if delete cookies on not during starting WebDriver
     * @return
     */
    private static WebDriver startDriver(boolean deleteCookies) {
        LOGGER.info("driver not initialized, starting:" + getBrowser());
        File file = null;
        switch (getBrowser()) {
            default:
                prepareFirefox();
        }

        LOGGER.info(getBrowserName() + " started");
        timeout = 30;
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        if (deleteCookies)
            driver.manage().deleteAllCookies();
        return driver;
    }

    /**
     * Returns currently used browser. Browsers supported are Firefox, IE, Chrome
     */
    private static browser getBrowser() {
        if (currentBrowser == null) currentBrowser = browser.FIREFOX;
        return currentBrowser;
    }

    /**
     * Sets browser to be used. Default is Firefox, can be IE or CHROME.
     *
     * @param browserName
     */
    public static void setBrowser(String browserName) {
        currentBrowser = browser.FIREFOX;
    }

    public static String getBrowserName() {
        return getBrowser().name();
    }


    /**
     * Obtains driver instance and starts it if it is not started.
     *
     * @return
     */
    public static WebDriver getDriver() {
        return (driver == null) ? startDriver() : driver;
    }

    /**
     * Kills webdriver, sets it to null and closes browser window.
     */
    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            LOGGER.info("Driver killed");
        }
    }

    private enum browser {
        IE, FIREFOX, GOOGLECHROME, SAFARI
    }

    private static void prepareFirefox() {
        // prepare information about firefox profile and it's config
        FirefoxProfile firefoxProfile = new FirefoxProfile();

        // Creating firefox Options instance from our Profile
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setProfile(firefoxProfile);

        // Try running legacy version for Firefox version less than 53
        try {
            firefoxOptions.setLegacy(true);
            driver = new AsquaredEventFiringWebDriver(new FirefoxDriver(firefoxOptions));
        } catch (WebDriverException e) {
            // If firefox is >= 53 then use geckodriver and move on.
            System.out.println("Firefox is too new for legacy ");
            firefoxOptions.setLegacy(false);
            // inform where is geckodriver exec
            System.setProperty("webdriver.gecko.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver");
            driver = new AsquaredEventFiringWebDriver(new FirefoxDriver(firefoxOptions));
        }
 }

}
