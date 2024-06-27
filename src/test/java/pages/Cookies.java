package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookies {

    private WebDriver driver;

    private By acceptCookie = By.xpath("//*[@id=\"shopify-pc__banner__btn-accept\"]");
      By newsletterPopup = By.cssSelector("#shopify-section-popup > aside");
    private  By newsletterFormInput= By.cssSelector("#newsletter-popup > input.Form__Input");

    public Cookies (WebDriver driver) {
        this.driver = driver;
    }

    public void clickAcceptCookies () {

        WebElement acceptCookies = driver.findElement(acceptCookie);
        acceptCookies.click();
    }
    public void showPopups () {
        WebElement cookie = driver.findElement(By.xpath("//*[@id=\"shopify-pc__banner__styles\"]"));
        cookie.isDisplayed();


    }

    public void newsletterClose () {
        WebElement newsletter = driver.findElement(newsletterPopup);
        newsletter.isDisplayed();
        WebElement fillTheFormNewsletter= driver.findElement(newsletterFormInput);
        fillTheFormNewsletter.sendKeys("strongmen@gmail.com");
        fillTheFormNewsletter.click();




    }


}
