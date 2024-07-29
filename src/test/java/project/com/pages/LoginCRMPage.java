package project.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.com.keywords.WebUI;

public class LoginCRMPage {
//    @FindBy(id = "iusername")
//    WebElement emailInput;
//
//    @FindBy(id = "ipassword")
//    WebElement passwordInput;
//
//    @FindBy(xpath = "//*[@id=\"erp-form\"]/div[2]/button")
//    WebElement loginButton;
//
//    @FindBy(xpath = "//*[@id=\"toast-container\"]/div")
//    WebElement alertMessage;

    By emailInput = By.id("iusername");
    By passwordInput = By.id("ipassword");
    By loginButton = By.xpath("//*[@id=\"erp-form\"]/div[2]/button");
    By alertMessage = By.xpath("//*[@id=\\\"toast-container\\\"]/div");

    public void iEnterEmailPassword(String email, String password){
        WebUI.setText(emailInput, email);
        WebUI.setText(passwordInput, password);
    }

    public void  clickLoginBtn(){
        WebUI.clickElement(loginButton, 10);
    }
}
