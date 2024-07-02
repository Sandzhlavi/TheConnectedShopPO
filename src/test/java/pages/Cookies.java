package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookies {

    private WebDriver driver;

    private final By acceptCookie = By.xpath("//*[@id=\"shopify-pc__banner__btn-accept\"]");

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




}
