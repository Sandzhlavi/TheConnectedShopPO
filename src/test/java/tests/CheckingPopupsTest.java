package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Cookies;
import pages.MainPage;
import pages.Popups;
import pages.WebDriverManager;

import java.time.Duration;

public class CheckingPopupsTest {
    private WebDriver driver;
    private WebDriverManager webDriverManager;
    private  MainPage mainPage;
    private Cookies cookies;
    private Popups popups;
    private WebDriverWait wait;


    @Before
    public void setup () {
        driver = WebDriverManager.getDriver();
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
            System.out.println("Popup for newsletter subscription is displayed.");

        } else {

            System.out.println("Popup for newsletter subscription is not displayed.");



    } }

    @Test

    public void cookiesAcceptTest() {

       mainPage.openSite();
       cookies.clickAcceptCookies();

    }
}









