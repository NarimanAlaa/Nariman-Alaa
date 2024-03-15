package driver_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverManager {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    public static void startChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("'--ignore-ssl-errors=yes'");
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }


    public static void tearDown() {
        driver.quit();
    }
}
