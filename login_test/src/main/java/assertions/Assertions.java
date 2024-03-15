package assertions;

import driver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Assertions {
    static Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(20);
    public static boolean elementExist(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            return false;
        }
        return by != null;
    }
    public static void elementExists(By by) {
        Assert.assertTrue(elementExist(by));
    }

    public static void assertTwoStrings(String expectedText, By by) {
        Assert.assertEquals(expectedText,DriverManager.getDriver().findElement(by).getText());
    }

    public static void assertAlertMsg(String expectedText) {
        Assert.assertEquals(expectedText,DriverManager.getDriver().switchTo().alert().getText());
    }

    public static void assertLongLoginTime(long loginTime) {
        Assert.assertTrue(loginTime < 5000);
    }
}
