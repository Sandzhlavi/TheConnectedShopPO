package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Popups {

    private WebDriver driver;
    private  WebDriverWait wait;
    private final By newsletterPopup = By.cssSelector("#shopify-section-popup > aside");
    private final By newsletterFormInput = By.cssSelector("#newsletter-popup > input.Form__Input");
    private final By closeNewsletterAd = By.className("NewsletterPopup__Close");

    public Popups (WebDriver driver) {
    this.driver=driver;
    this.wait= new WebDriverWait(driver,Duration.ofSeconds(2));
    }

    public boolean isNewsletterShown() {
        try {
            WebElement newsletter = wait.until(ExpectedConditions.visibilityOfElementLocated(newsletterPopup));
            return newsletter.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void enterEmail(String email) {

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(newsletterFormInput));
        emailInput.sendKeys(email);


    }

    public void newsletterClose() {

        WebElement closeAdNewsletter = driver.findElement(closeNewsletterAd);
        closeAdNewsletter.click();

    }
}


