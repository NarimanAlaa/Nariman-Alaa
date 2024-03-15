package procedures;


import assertions.Assertions;
import page_objects.home_page.HomePageHelper;
import page_objects.login_page.LoginPageHelper;


public class LoginProcedure {


    public static void validLogin() {
        LoginPageHelper.enterUsername("standard_user");
        LoginPageHelper.enterPassword("secret_sauce");
        long startTime = System.currentTimeMillis();
        LoginPageHelper.clickLoginBtn();
        HomePageHelper.assertSuccessfulLogin();
        long endTime = System.currentTimeMillis();
        Assertions.assertLongLoginTime(endTime - startTime);
    }

    public static void visualUser() {
        LoginPageHelper.enterUsername("visual_user");
        LoginPageHelper.enterPassword("secret_sauce");
        long startTime = System.currentTimeMillis();
        LoginPageHelper.clickLoginBtn();
        HomePageHelper.assertSuccessfulLogin();
        long endTime = System.currentTimeMillis();
        Assertions.assertLongLoginTime(endTime - startTime);
    }

    public static void problemUser() {
        LoginPageHelper.enterUsername("problem_user");
        LoginPageHelper.enterPassword("secret_sauce");
        long startTime = System.currentTimeMillis();
        LoginPageHelper.clickLoginBtn();
        HomePageHelper.assertSuccessfulLogin();
        long endTime = System.currentTimeMillis();
        Assertions.assertLongLoginTime(endTime - startTime);
    }


    public static void loginWithEmptyUsername() {
        LoginPageHelper.enterUsername("");
        LoginPageHelper.enterPassword("secret_sauce");
        LoginPageHelper.clickLoginBtn();
        LoginPageHelper.assertEmptyUsernameField();
    }


    public static void loginWithEmptyPassword() {
        LoginPageHelper.enterUsername("test_user");
        LoginPageHelper.enterPassword("");
        LoginPageHelper.clickLoginBtn();
        LoginPageHelper.assertEmptyPasswordField();
    }


    public static void loginWithWrongUsername() {
        LoginPageHelper.enterUsername("test_user");
        LoginPageHelper.enterPassword("secret_sauce");
        LoginPageHelper.clickLoginBtn();
        LoginPageHelper.assertWrongCredentials();
    }


    public static void loginWithWrongPassword() {
        LoginPageHelper.enterUsername("standard_user");
        LoginPageHelper.enterPassword("test_password");
        LoginPageHelper.clickLoginBtn();
        LoginPageHelper.assertWrongCredentials();
    }


    public static void lockedUser() {
        LoginPageHelper.enterUsername("locked_out_user");
        LoginPageHelper.enterPassword("secret_sauce");
        LoginPageHelper.clickLoginBtn();
        LoginPageHelper.assertLockedUser();
    }


    public static void errorUser() {
        LoginPageHelper.enterUsername("error_user");
        LoginPageHelper.enterPassword("secret_sauce");
        long startTime = System.currentTimeMillis();
        LoginPageHelper.clickLoginBtn();
        HomePageHelper.assertSuccessfulLogin();
        long endTime = System.currentTimeMillis();
        Assertions.assertLongLoginTime(endTime - startTime);
        HomePageHelper.selectSortByPrice();
        HomePageHelper.assertProductSorting();
        //HomePageHelper.assertSortingError();
    }


    public static void performanceUser() {
        LoginPageHelper.enterUsername("performance_glitch_user");
        LoginPageHelper.enterPassword("secret_sauce");
        long startTime = System.currentTimeMillis();
        LoginPageHelper.clickLoginBtn();
        HomePageHelper.assertSuccessfulLogin();
        long endTime = System.currentTimeMillis();
        Assertions.assertLongLoginTime(endTime - startTime);
    }
}
