package page_objects.login_page;

import org.openqa.selenium.By;

public class LoginPageElements {
    static By userNameTextField = By.id("user-name");
    static By passwordTextField = By.id("password");
    static By loginBtn = By.id("login-button");
    static By invalidLoginErrorMsg = By.xpath("//*[@data-test='error']");

}
