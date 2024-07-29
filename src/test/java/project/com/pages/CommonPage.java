package project.com.pages;

import org.openqa.selenium.By;
import project.com.common.BaseTest;
import project.com.keywords.WebUI;

import java.util.Base64;

public class CommonPage {
    By homeOption = By.xpath("//*[@id=\"main-menu\"]/li[1]/a");
    By productsMenu = By.xpath("//*[@id=\"main-menu\"]/li[2]/a");
    By categoryMenu = By.xpath("//*[@id=\"main-menu\"]/li[2]/ul/li[8]/a");
//    By menu = By.xpath("");
//    By menu = By.xpath("");
//    By menu = By.xpath("");
//    By menu = By.xpath("");

    public void clickHomeOption(){
        WebUI.clickElement(homeOption, 10);
    }

    public void clickMenuProduct(){
        WebUI.clickElement(productsMenu, 10);
    }

    public CategoryPage openCategoryMenu(){
        WebUI.clickElement(categoryMenu, 10);
        return new CategoryPage();
    }

    public void login(){
        WebUI.openURL("https://cms.anhtester.com/login");
        LoginCMSPage loginCMSPage = new LoginCMSPage();
        loginCMSPage.userEnterEmailAndPassword("admin@example.com", "123456");
        loginCMSPage.clickLoginButton();
    }
}
