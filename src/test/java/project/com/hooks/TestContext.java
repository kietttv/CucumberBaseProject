package project.com.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import project.com.driver.DriverFactory;
import project.com.driver.DriverManager;
import project.com.pages.BrandPage;
import project.com.pages.Category.CategoryCreatePage;
import project.com.pages.Category.CategoryPage;
import project.com.pages.CommonPage;
import project.com.pages.LoginCMSPage;
import project.com.utils.LogUtils;

public class TestContext {
    private CommonPage commonPage;
    private LoginCMSPage loginCMSPage;
    private CategoryPage categoryPage;
    private CategoryCreatePage categoryCreatePage;
    private BrandPage brandPage;

    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver("chrome"));
        LogUtils.info("Driver in TestContext: " + getDriver());
    }

    public CommonPage getCommonPage() {
        if (commonPage == null){
            commonPage = new CommonPage();
        }
        return commonPage;
    }

    public LoginCMSPage getLoginCMSPage() {
        if (loginCMSPage == null){
            loginCMSPage = new LoginCMSPage();
        }
        return loginCMSPage;
    }

    public CategoryPage getCategoryPage() {
        if (categoryPage == null){
            categoryPage = new CategoryPage();
        }
        return categoryPage;
    }

    public CategoryCreatePage getCategoryCreatePage() {
        if (categoryCreatePage == null){
            categoryCreatePage = new CategoryCreatePage();
        }
        return categoryCreatePage;
    }

    public BrandPage getBrandPage() {
        if (brandPage == null){
            brandPage = new BrandPage();
        }
        return brandPage;
    }

    public WebDriver getDriver(){
        return DriverManager.getDriver();
    }
}
