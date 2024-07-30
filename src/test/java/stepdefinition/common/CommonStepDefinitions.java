package stepdefinition.common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import project.com.driver.DriverManager;
import project.com.hooks.TestContext;
import project.com.pages.BrandPage;
import project.com.pages.Category.CategoryCreatePage;
import project.com.pages.Category.CategoryPage;
import project.com.pages.CommonPage;
import project.com.pages.LoginCMSPage;

public class CommonStepDefinitions {
    TestContext testContext;
    CommonPage commonPage;
    CategoryPage categoryPage;
    CategoryCreatePage categoryCreatePage;
    LoginCMSPage loginCMSPage;
    BrandPage brandPage;

    public CommonStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
        categoryPage = testContext.getCategoryPage();
        categoryCreatePage = testContext.getCategoryCreatePage();
        brandPage = testContext.getBrandPage();
    }

    @Given("user loged in the CMS system")
    public void userLogedInTheCMSSystem() {
//        BaseTest.createDriver("chrome");
//        WebUI.openURL("https://cms.anhtester.com/login");
        loginCMSPage.loginAdminRole();
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

//    @Then("the message {string} is displayed")
//    public void theMessageIsDisplayed(String message) {
//        try {
//            Assert.assertEquals(commonPage.getAlertMessage(), message, "Not match");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
}
