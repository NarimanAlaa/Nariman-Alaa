package test_base;
import driver_manager.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

    @BeforeMethod
    public static void initialize() {
        DriverManager.startChrome();
    }

    @AfterMethod
    public static void tearDown() {DriverManager.tearDown();}

}
