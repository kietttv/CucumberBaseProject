package stepdefinition.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import project.com.common.BaseTest;
import project.com.driver.DriverManager;
import project.com.keywords.WebUI;
import project.com.pages.LoginCMSPage;

public class LoginToCMStepdefs {
    LoginCMSPage loginCMSPage;

    @Given("User navigate to Login page {string}")
    public void userNavigateToLoginPage(String url) {
        loginCMSPage = new LoginCMSPage();
//        BaseTest.createDriver("chrome");
        WebUI.openURL(url);
    }

    @When("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String emailStr, String passwordStr) {
        loginCMSPage.userEnterEmailAndPassword(emailStr, passwordStr);
    }

    @And("click login button")
    public void clickLoginButton() {
        loginCMSPage.clickLoginButton();
    }

    @Then("user redirect to admin page {string}")
    public void userRedirectToAdminPage(String adminPageUrl) {
        WebUI.verifyEquals(DriverManager.getDriver().getCurrentUrl(), adminPageUrl);
//        BaseTest.closeDriver();
    }
}
