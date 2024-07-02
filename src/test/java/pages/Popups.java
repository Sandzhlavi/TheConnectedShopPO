package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popups {

    private WebDriver driver;
    private final By newsletterPopup = By.cssSelector("#shopify-section-popup > aside");
    private final By newsletterFormInput = By.cssSelector("#newsletter-popup > input.Form__Input");
    private final By closeNewsletterAd = By.className("NewsletterPopup__Close");

    public Popups (WebDriver driver) {
    this.driver=driver;
    }

    public void newsletterShown() {

        WebElement newsletter = driver.findElement(newsletterPopup);
        newsletter.isDisplayed();

    }
    public void enterEmail(String email) {
        newsletterFormInput.


        .sendKeys("strongmen@gmail.com");
      .click();

    }

    public void newsletterClose() {

        WebElement closeAdNewsletter = driver.findElement(closeNewsletterAd);
        closeAdNewsletter.click();

    }
}


