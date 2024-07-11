package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverManager {
    private static WebDriver driver;

    /*public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
*/
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // headless
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }

    }

