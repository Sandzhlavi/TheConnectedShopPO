package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.DriverManager;

public class SearchTest {

    private WebDriver driver;

    private MainPage mainPage;



    @BeforeClass

    public void setup () {
        driver = DriverManager.getDriver();
        mainPage = new MainPage(driver);
        mainPage.openSite();

    }


        @Test

       public void Search ()  {


           mainPage.checkSearchButton();


        }

        @AfterClass

    public void close () {

        DriverManager.closeDriver();

        }


}
