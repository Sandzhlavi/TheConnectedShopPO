package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Collections {

    private WebDriver driver;
    public Collections (WebDriver driver) {
        this.driver =driver;

    }

    public void openCollections () {

        WebElement products = driver.findElement(By.xpath("//*[@id=\"section-list-collections-template\"]/div/a[1]/div/div[2]/header/div/span"));
        products.click();

    }
}
