package test;

import org.testng.annotations.Test;
import procedures.LoginProcedure;
import test_base.TestBase;


public class LoginTest extends TestBase {

    @Test(priority = 1)
    void validLoginTest() {
        LoginProcedure.validLogin();
    }

    @Test(priority = 2)
    void emptyUsernameLoginTest() {
        LoginProcedure.loginWithEmptyUsername();
    }

    @Test(priority = 3)
    void emptyPasswordLoginTest() {
        LoginProcedure.loginWithEmptyPassword();
    }

    @Test(priority = 4)
    void wrongUsernameLoginTest() {
        LoginProcedure.loginWithWrongUsername();
    }

    @Test(priority = 5)
    void wrongPasswordLoginTest() {
        LoginProcedure.loginWithWrongPassword();
    }

    @Test(priority = 6)
    void lockedUserLoginTest() {
        LoginProcedure.lockedUser();
    }

    @Test(priority = 7)
    void problemUserLoginTest() {LoginProcedure.problemUser();}

    @Test(priority = 8)
    void visualLoginTest() {
        LoginProcedure.visualUser();
    }

    @Test(priority = 9)
    void errorUserLoginTest() {
        LoginProcedure.errorUser();
    }

    @Test(priority = 10)
    void performanceUserLoginTest() {
        LoginProcedure.performanceUser();
    }
}
