package stepdefinition.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.com.driver.DriverManager;
import project.com.hooks.TestContext;
import project.com.keywords.WebUI;
import project.com.pages.Category.CategoryCreatePage;
import project.com.pages.Category.CategoryPage;
import project.com.pages.CommonPage;
import project.com.pages.LoginCMSPage;

import static java.lang.Thread.sleep;

public class CategoryStepdefs {
    TestContext testContext;
    CommonPage commonPage;
    CategoryPage categoryPage;
    CategoryCreatePage categoryCreatePage;
    LoginCMSPage loginCMSPage;

    public CategoryStepdefs(TestContext testContext) {
        this.testContext = testContext;
        commonPage = testContext.getCommonPage();
        loginCMSPage = testContext.getLoginCMSPage();
        categoryPage = testContext.getCategoryPage();
        categoryCreatePage = testContext.getCategoryCreatePage();
    }

    @Given("user has access to the Category page")
    public void userHasAccessToTheCategoryPage() {
        commonPage.clickMenuProduct();
        commonPage.openCategoryMenu();
    }

    @When("user has finished entering category name {string} information")
    public void userHasFinishedEnteringCategoryNameInformation(String nameStr) {
        categoryPage.clickAddNewCategoryBtn();
        categoryCreatePage.setName(nameStr);
    }

    @And("user has finished entering category parent {string} information")
    public void userHasFinishedEnteringCategoryParentInformation(String parentCategoryValue) {
        categoryCreatePage.setParentCategory(parentCategoryValue);
    }

    @And("user has finished entering category ordering number {string} information")
    public void userHasFinishedEnteringCategoryOrderingNumberInformation(String orderingNumberValue) {
        categoryCreatePage.setOrderingNumber(orderingNumberValue);
    }

    @And("user has finished entering category type {string} information")
    public void userHasFinishedEnteringCategoryTypeInformation(String typeValue) {
        categoryCreatePage.setType(typeValue);
    }

    @And("user has finished entering category banner {string} information")
    public void userHasFinishedEnteringCategoryBannerInformation(String bannerValue) {
        categoryCreatePage.setBanner(bannerValue);
    }

    @And("user has finished entering category icon {string} information")
    public void userHasFinishedEnteringCategoryIconInformation(String iconValue) {
        categoryCreatePage.setIcon(iconValue);
    }

    @And("user has finished entering category meta title {string} information")
    public void userHasFinishedEnteringCategoryMetaTitleInformation(String metaTitleValue) {
        categoryCreatePage.setMetaTitle(metaTitleValue);
    }

    @And("user has finished entering category meta description {string} information")
    public void userHasFinishedEnteringCategoryMetaDescriptionInformation(String metaDescriptionValue) {
        categoryCreatePage.setMetaDescription(metaDescriptionValue);
    }

    @And("user has finished entering category filter attibutes {string} information")
    public void userHasFinishedEnteringCategoryFilterAttibutesInformation(String filteringAttributesValue) {
        categoryCreatePage.setFilteringAttributes(filteringAttributesValue);
    }

    @When("user search a category existing {string}")
    public void  userSearchACategoryExisting(String categoryName){
       categoryPage.search(categoryName);
       WebUI.waitForPageLoaded();
    }

    @And("user edit the category information")
    public void userEditTheCategoryInformation(){
        categoryPage.clickUpdateBtn();
        categoryCreatePage.setName(" edited");
    }

    @And("click the save button")
    public void clickTheSaveButton() {
        categoryCreatePage.clickSaveBtn();
    }

    @Then("the message {} displays")
    public void theMessageDisplays(String expectedMessage) {
        try {
            WebElement messageAlert = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/span"));
            Assert.assertTrue(messageAlert.isDisplayed());
            Assert.assertEquals(messageAlert.getText(), expectedMessage);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
