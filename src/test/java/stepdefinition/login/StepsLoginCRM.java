package stepdefinition.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import project.com.common.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.com.constants.ConstantGlobal;
import project.com.driver.DriverManager;
import project.com.keywords.WebUI;
import project.com.pages.LoginCRMPage;

import java.time.Duration;

public class StepsLoginCRM {
    LoginCRMPage loginCRMPage = new LoginCRMPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
//        BaseTest.createDriver("chrome");
//        DriverManager.getDriver().get(ConstantGlobal.URL);
        WebUI.openURL(ConstantGlobal.URL);
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
//        DriverManager.getDriver().findElement(By.id("iusername")).sendKeys(ConstantGlobal.USERNAME);
//        DriverManager.getDriver().findElement(By.id("ipassword")).sendKeys(ConstantGlobal.PASSWORD);
        loginCRMPage.iEnterEmailPassword(ConstantGlobal.USERNAME, ConstantGlobal.PASSWORD);
    }

    @And("I click the Login button")
    public void iClickTheLoginButton() {
//        DriverManager.getDriver().findElement(By.xpath("//*[@id=\"erp-form\"]/div[2]/button")).click();
        loginCRMPage.clickLoginBtn();
    }

    @Then("I should be taken to the Dashboard page")
    public void iShouldBeTakenToTheDashboardPage() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]")));
        Assert.assertTrue(dashboard.isDisplayed());
    }

    @And("I should see the {string} menu")
    public void iShouldSeeTheMenu(String arg0) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        WebElement menuStr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/nav/div/div/ul/li[1]/label")));
        Assert.assertEquals(arg0,menuStr.getText());
//        BaseTest.closeDriver();
    }
}
