package project.com.common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import project.com.driver.DriverManager;
import project.com.hooks.TestContext;
import project.com.keywords.WebUI;
import project.com.pages.*;

public class CommonStepDefinitions {
    TestContext testContext;
    LoginCMSPage loginCMSPage;
    CommonPage commonPage;
    CategoryPage categoryPage;
    CategoryCreatePage categoryCreatePage;
    CategoryEditPage categoryEditPage;

    public CommonStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
    }

    @Given("user loged in the CMS system")
    public void userLogedInTheCMSSystemWithRoleName() {
        loginCMSPage.loginAdminRole();
    }

    @Then("the {string} message displays")
    public void theMessageDisplays(String message) {
        try {
            String url = DriverManager.getDriver().getCurrentUrl();
            Assert.assertEquals(url, message);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//        finally {
//            BaseTest.closeDriver();
//        }
    }
}
