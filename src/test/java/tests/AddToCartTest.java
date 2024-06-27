package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Cookies;
import pages.MainPage;
import pages.WebDriverManager;

import java.util.Collections;

public class AddToCartTest {

    private MainPage mainPage;
    private Cookies cookies;

@Before

public void setup () {
    WebDriver driver = WebDriverManager.getDriver();
    mainPage = new MainPage(driver);
    cookies = new Cookies(driver);
    mainPage.openSite();

    
}

@Test



    public void addToCart () {

  cookies.showPopups();
  cookies.clickAcceptCookies();

    
    mainPage.addToCart();

}

@Test

public void newsletterPopupClose () {

}

@After

    public void close () {

    WebDriverManager.closeDriver();

}

}



