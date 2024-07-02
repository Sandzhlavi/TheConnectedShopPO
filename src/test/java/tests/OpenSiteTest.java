package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.WebDriverManager;

public class OpenSiteTest {

    private WebDriver driver;

    private MainPage mainPage;

    @Before
    public void setup () {
        driver= WebDriverManager.getDriver();
        mainPage= new MainPage(driver);

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

    @After

    public void close () {
     WebDriverManager.closeDriver();

    }
}
