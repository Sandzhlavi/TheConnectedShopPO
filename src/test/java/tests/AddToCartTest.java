package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.Cookies;
import pages.MainPage;
import pages.Popups;
import pages.DriverManager;

import java.util.Collections;

public class AddToCartTest {

    private MainPage mainPage;
    private Cookies cookies;
    private Popups popups;



@Before

public void setup () {
    WebDriver driver = DriverManager.getDriver();
    mainPage = new MainPage(driver);
    cookies = new Cookies(driver);
    popups= new Popups(driver);
    mainPage.openSite();


    
}

//@Test

   // public void addToCart () {

  //cookies.clickAcceptCookies();

    
    //mainPage.addToCart();

//}

//@Test

//public void testNewsletterPopupPresence() {

  //  if (popups.isNewsletterShown())
 //   {
   //     System.out.println("Popup for newsletter subscription is displayed.");

  //  } else {

  //      System.out.println("Popup for newsletter subscription is not displayed.");
 //   }
//}

@AfterClass

    public void close () {

    DriverManager.closeDriver();

}

}



