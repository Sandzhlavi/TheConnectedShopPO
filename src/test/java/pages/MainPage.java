package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage {


private final WebDriver driver;

    private final By buttonSearch= By.cssSelector ("#section-header > div > div:nth-child(3) > nav > ul > li:nth-child(2) > a");
    private final By searchInputField = By.xpath("//*[@id=\"Search\"]/div/div[1]/form/input[1]");
    private final By fingerPrintDoorLockProduct = By.xpath("//*[@id=\"shopify-section-collection-template\"]/section/div[4]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/h2/a");
    private final By buttonAddToCart= By.xpath("//*[@id=\"product_form_6198418636972\"]/button");


    public MainPage (WebDriver driver) {
      this.driver=driver;

    }

    public void openSite () {
      driver.get( "https://theconnectedshop.com/");

    }
    public String getTitle () {
        return driver.getTitle();

    }

    public String getCurrentUrl () {
        return driver.getCurrentUrl();

    }


   public void checkSearchButton () {

       WebElement searchButton = driver.findElement (buttonSearch);

       searchButton.click();

       WebElement searchField= driver.findElement(searchInputField);
       searchField.sendKeys("SMART DOOR"  );

   }

   public void addToCart () {


       WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[4]/a"));
       acceptButton.click();


       WebElement search = driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[4]/a"));
       search.click();


       WebElement products = driver.findElement(By.xpath("//*[@id=\"section-list-collections-template\"]/div/a[1]/div/div[2]/header/div/span"));
       products.click();
       WebElement productTitle = driver.findElement(By.xpath("//h2[@class='ProductItem__Title Heading']/a[@href='/collections/connected-home/products/fingerprint-door-lock']"));

       WebElement fingerPrintDoorLock = driver.findElement(fingerPrintDoorLockProduct);
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fingerPrintDoorLock);
       fingerPrintDoorLock = driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-template\"]/section/div[4]/div[1]/div[2]/div[1]/div/div[3]/div/div/div/h2/a"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fingerPrintDoorLock);

       WebElement addToCartButton = driver.findElement (buttonAddToCart);
       addToCartButton.click();

   }
}
