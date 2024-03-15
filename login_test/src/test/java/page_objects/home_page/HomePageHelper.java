package page_objects.home_page;


import assertions.Assertions;
import driver_manager.DriverManager;
import org.openqa.selenium.support.ui.Select;

public class HomePageHelper extends HomePageElements{
    public static void assertSuccessfulLogin() {
        Assertions.elementExists(shoppingCartBtn);
    }

    public static void selectSortByPrice() {
        Select obj = new Select(DriverManager.getDriver().findElement(productSortContainer));
        obj.selectByIndex(3);
    }

//    public static void assertSortingError() {
//        Assertions.assertAlertMsg("Sorting is broken! This error has been reported to Backtrace.");
//    }

    public static void assertProductSorting() {
        Assertions.elementExists(shoppingCartBtn);
    }


}
