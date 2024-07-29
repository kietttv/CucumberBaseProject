package project.com.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import project.com.driver.DriverFactory;
import project.com.driver.DriverManager;
import project.com.pages.*;
import project.com.utils.LogUtils;

import static project.com.driver.DriverManager.getDriver;

public class TestContext {
    private WebDriver webDriver;
    private CommonPage commonPage;
    private LoginCRMPage loginCRMPage;
    private LoginCMSPage loginCMSPage;
    private CategoryPage categoryPage;
    private CategoryCreatePage categoryCreatePage;
    private CategoryEditPage categoryEditPage;

    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver());
        LogUtils.info("Driver in TestContext: " + getDriver());
    }

    public WebDriver getWebDriver() {
        return DriverManager.getDriver();
    }

    public CommonPage getCommonPage() {
        if(commonPage == null){
            commonPage = new CommonPage();
        }
        return commonPage;
    }

    public LoginCRMPage getLoginCRMPage() {
        if(loginCRMPage == null){
            loginCRMPage = new LoginCRMPage();
        }
        return loginCRMPage;
    }

    public LoginCMSPage getLoginCMSPage() {
        if(loginCMSPage == null){
            loginCMSPage = new LoginCMSPage();
        }
        return loginCMSPage;
    }

    public CategoryPage getCategoryPage() {
        if(categoryPage == null){
            categoryPage = new CategoryPage();
        }
        return categoryPage;
    }

    public CategoryCreatePage getCategoryCreatePage() {
        if(categoryCreatePage == null){
            categoryCreatePage = new CategoryCreatePage();
        }
        return categoryCreatePage;
    }

    public CategoryEditPage getCategoryEditPage() {
        if(categoryEditPage == null){
            categoryEditPage = new CategoryEditPage();
        }
        return categoryEditPage;
    }
}
