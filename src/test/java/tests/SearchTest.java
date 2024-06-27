package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.WebDriverManager;

public class SearchTest {

    private WebDriver driver;

    private MainPage mainPage;



    @Before

    public void setup () {
        driver = WebDriverManager.getDriver();
        mainPage = new MainPage(driver);
        mainPage.openSite();

    }


        @Test

       public void Search ()  {


           mainPage.checkSearchButton();


        }

        @After

    public void close () {

        WebDriverManager.closeDriver();

        }


}
