package stepdefinition.common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.com.driver.DriverManager;
import project.com.hooks.TestContext;
import project.com.pages.CategoryCreatePage;
import project.com.pages.CategoryPage;
import project.com.pages.CommonPage;
import project.com.pages.LoginCMSPage;

public class CommonStepDefinitions {
    TestContext testContext;
    CommonPage commonPage;
    CategoryPage categoryPage;
    CategoryCreatePage categoryCreatePage;
    LoginCMSPage loginCMSPage;

    public CommonStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
        categoryPage = testContext.getCategoryPage();
        categoryCreatePage = testContext.getCategoryCreatePage();
    }

    @Given("user loged in the CMS system")
    public void userLogedInTheCMSSystem() {
//        BaseTest.createDriver("chrome");
        loginCMSPage.loginAdminRole();
//        WebUI.openURL("https://cms.anhtester.com/login");
//        loginCMSPage.loginAdminRole();
    }


    @Then("the categories page {string} is displays")
    public void CategoriesPageDisplays(String expectedUrl) {
        try {
            Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), expectedUrl);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
