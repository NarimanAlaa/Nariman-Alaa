package page_objects.login_page;

import assertions.Assertions;
import driver_manager.DriverManager;

public class LoginPageHelper extends LoginPageElements {

    public static void enterUsername(String username) {
        DriverManager.getDriver().findElement(userNameTextField).sendKeys(username);
    }

    public static void enterPassword(String password) {
        DriverManager.getDriver().findElement(passwordTextField).sendKeys(password);
    }

    public static void clickLoginBtn() {
        DriverManager.getDriver().findElement(loginBtn).click();
    }

    public static void assertWrongCredentials() {
        Assertions.assertTwoStrings("Epic sadface: Username and password do not match any user in this service", invalidLoginErrorMsg);
    }

    public static void assertLockedUser() {
        Assertions.assertTwoStrings("Epic sadface: Sorry, this user has been locked out.",invalidLoginErrorMsg);
    }

    public static void assertEmptyUsernameField() {
        Assertions.assertTwoStrings("Epic sadface: Username is required",invalidLoginErrorMsg);
    }

    public static void assertEmptyPasswordField() {
        Assertions.assertTwoStrings("Epic sadface: Password is required",invalidLoginErrorMsg);
    }
}
