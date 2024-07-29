package stepdefinition.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import project.com.common.BaseTest;
import project.com.driver.DriverManager;
import project.com.keywords.WebUI;
import project.com.pages.CategoryCreatePage;
import project.com.pages.CategoryPage;
import project.com.pages.CommonPage;
import project.com.pages.LoginCMSPage;

public class CategoryStepdefs {
    CommonPage commonPage = new CommonPage();
    CategoryPage categoryPage = new CategoryPage();
    CategoryCreatePage categoryCreatePage = new CategoryCreatePage();
    @Given("user loged in the CMS system")
    public void userLogedInTheCMSSystem() {
//        BaseTest.createDriver("chrome");
        commonPage.login();
    }

    @Given("user has access to the Category page")
    public void userHasAccessToTheCategoryPage() {
        commonPage.clickMenuProduct();
        commonPage.openCategoryMenu();
        categoryPage.clickAddNewCategoryBtn();
    }

    @When("user has finished entering category name {string} information")
    public void userHasFinishedEnteringCategoryNameInformation(String nameStr) {
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

    @And("click the save button")
    public void clickTheSaveButton() {
        categoryCreatePage.clickSaveBtn();
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
