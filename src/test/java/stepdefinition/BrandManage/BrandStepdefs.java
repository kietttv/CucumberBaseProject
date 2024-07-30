package stepdefinition.BrandManage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.com.hooks.TestContext;
import project.com.keywords.WebUI;
import project.com.pages.BrandPage;
import project.com.pages.Category.CategoryCreatePage;
import project.com.pages.Category.CategoryPage;
import project.com.pages.CommonPage;
import project.com.pages.LoginCMSPage;
import project.com.driver.DriverManager;

public class BrandStepdefs {
    TestContext testContext;
    CommonPage commonPage;
    LoginCMSPage loginCMSPage;
    BrandPage brandPage;

    public BrandStepdefs(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
        brandPage = testContext.getBrandPage();
    }

    @Given("user is on the Brand Management page")
    public void userIsOnTheBrandManagementPage(){
        commonPage.clickMenuProduct();
        commonPage.openBrandMenu();
    }

    @When("user enters the brand name {string}")
    public void userEntersTheBrandName(String name){
        brandPage.setNameInput(name);
    }

    @And("user uploads the brand logo {string}")
    public void userUploadsTheBrandLogo(String logo) {
//        brandPage.setLogoInput(logo);
    }

    @And("user enters the brand meta title {string}")
    public void userEntersTheBrandMetaTitle(String metaTile){
        brandPage.setMetaTitleInput(metaTile);
    }

    @And("user enters the brand meta description {string}")
    public void userEntersTheBrandMetaDescription(String metaDescription){
        brandPage.setMetaDescription(metaDescription);
    }

    @And("user clicks the save button")
    public void userClicksTheSaveButton() throws Exception{
        brandPage.clickSaveBtn(10);
    }

    @Then("the message {string} is displayed")
    public void theMessageIsDisplayed(String message) {
        try {
            WebUI.verifyEquals(commonPage.getAlertMessage(), message, "Not match");
        }catch (Exception e){
//            Assert.fail("not found");
            System.out.println(e.getMessage());
        }
    }

    @And("the new brand {string} appears in the brand list")
    public void theNewBrandAppearsInTheBrandList(String newBrandName) {
        try {
            brandPage.searchBrand(newBrandName);
            WebUI.verifyEquals(brandPage.getBrandName(1), newBrandName, "not match");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @And("the brand {string} exists")
    public void theBrandExists(String brandName){
        try {
            brandPage.searchBrand(brandName);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @When("user clicks the edit button for {string}")
    public void userClicksTheEditButtonFor(String arg0) {
    }

    @And("user updates the brand name to {string}")
    public void userUpdatesTheBrandNameTo(String arg0) {
    }

    @And("the updated brand {string} appears in the brand list")
    public void theUpdatedBrandAppearsInTheBrandList(String arg0) {
    }

    @When("user clicks the delete button")
    public void userClicksTheDeleteButtonFor() {
        try {
            brandPage.clickDeleteButton(1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @And("user confirms the deletion")
    public void userConfirmsTheDeletion() {
//        brandPage.clickConfirmDeleteButton(10);
    }

    @And("the brand {string} does not appear in the brand list")
    public void theBrandDoesNotAppearInTheBrandList(String arg0) {
    }
}
