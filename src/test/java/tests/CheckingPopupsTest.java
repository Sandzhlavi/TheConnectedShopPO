package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.Cookies;
import pages.DriverManager;
import pages.MainPage;
import pages.Popups;
import pages.DriverManager;

import java.time.Duration;
import java.util.logging.Logger;

public class CheckingPopupsTest {
    private WebDriver driver;
    private DriverManager webDriverManager;
    private  MainPage mainPage;
    private Cookies cookies;
    private Popups popups;
    private WebDriverWait wait;
    private static final Logger logger = Logger.getLogger(CheckingPopupsTest.class.getName());


    @BeforeClass
    public void setup () {
        driver = DriverManager.getDriver();
        mainPage = new MainPage(driver);
        popups = new Popups(driver);
        cookies = new Cookies(driver);
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    @Test

  public void popupNewsletterSubscribeTest () {

        mainPage.openSite();
        popups.isNewsletterShown();
        popups.enterEmail("hellopeople@gmail.com");
        popups.newsletterClose();

        if (popups.isNewsletterShown())
        {
            logger.info("Popup for newsletter subscription is displayed.");

        } else {

            logger.info("Popup for newsletter subscription is not displayed.");



    } }

    @Test

    public void cookiesAcceptTest() {

       mainPage.openSite();
        cookies.clickAcceptCookies();

    }

    @AfterClass

    public void close () {

        DriverManager.closeDriver();

    } }









