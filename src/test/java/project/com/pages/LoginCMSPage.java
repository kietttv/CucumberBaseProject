package project.com.pages;

import org.openqa.selenium.By;
import project.com.keywords.WebUI;

public class LoginCMSPage {
    By emailInput = By.xpath("//*[@id=\"email\"]");
    By passwordInput = By.xpath("//*[@id=\"password\"]");
    By rememberMeCheckBox = By.xpath("//*[@id=\"remember\"]");
    By loginButton = By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/form/button");
    By forgotPasswordLink = By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/form/div[3]/div[2]/div/a");

    public void userEnterEmailAndPassword(String emailStr, String passwordStr){
        WebUI.setText(emailInput, emailStr);
        WebUI.setText(passwordInput, passwordStr);
    }

    public void clickLoginButton(){
        WebUI.clickElement(loginButton, 10);
    }

    public void loginAdminRole(){
        WebUI.openURL("https://cms.anhtester.com/login");
        userEnterEmailAndPassword("admin@example.com", "123456");
        clickLoginButton();
    }

    public void loginUserRole(){
        userEnterEmailAndPassword("user@example.com", "123456");
        clickLoginButton();
    }
}
