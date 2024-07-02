package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Cookies;
import pages.MainPage;
import pages.Popups;
import pages.WebDriverManager;

import java.util.Collections;

public class AddToCartTest {

    private MainPage mainPage;
    private Cookies cookies;
    private Popups popups;



@Before

public void setup () {
    WebDriver driver = WebDriverManager.getDriver();
    mainPage = new MainPage(driver);
    cookies = new Cookies(driver);
    popups= new Popups(driver);
    mainPage.openSite();


    
}

@Test

    public void addToCart () {

  cookies.showPopups();
  cookies.clickAcceptCookies();

    
    mainPage.addToCart();

}

@Test
public void testNewsletterPopupPresence() {

    if pop.isDisplayed()) {

    } else {

        System.out.println("Popup for newsletter subscription is not displayed.");
    }
}
@After

    public void close () {

    WebDriverManager.closeDriver();

}

}



