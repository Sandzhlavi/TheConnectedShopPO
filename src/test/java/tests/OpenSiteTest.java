package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DriverManager;
import pages.MainPage;
import pages.Popups;


public class OpenSiteTest {

    private WebDriver driver;
    private MainPage mainPage;
    private Popups popups;

    @BeforeClass
    public void setup () {
        driver= DriverManager.getDriver();
        mainPage= new MainPage(driver);
        popups=new Popups(driver);

    }

    @Test

    public void checkTitle () {

      mainPage.openSite();

        String expectedTitle = "The Connected Shop - Smart Locks, Smart Sensors, Smart Home & Office";
        String actualTitle = mainPage.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }
    @Test


    public void currentUrlGet () {
        mainPage.openSite();
        String expectedUrl= "https://theconnectedshop.com/";
        String actualUrl = mainPage.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Test
    public  void checkPopup () {
        mainPage.openSite();
        if (popups.isNewsletterShown()){

            System.out.println("Popup for newsletter subscription is displayed.");

        }
        else {

            System.out.println("Popup for newsletter subscription is not displayed.");
        }


    }

    @AfterClass

    public void close () {
     DriverManager.closeDriver();

    }
}
