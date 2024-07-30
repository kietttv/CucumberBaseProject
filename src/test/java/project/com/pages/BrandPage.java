package project.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import project.com.driver.DriverManager;
import project.com.keywords.WebUI;

import java.util.List;

public class BrandPage {
    By brandLabel = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/h1");
    By searchInput = By.xpath("//*[@id=\"search\"]");
    By tableRows = By.xpath("//table[@class='table aiz-table mb-0 footable footable-1 breakpoint-xl']//tbody//tr");
    By nameInput = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/input");
    By logoInput = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/div[1]");
    By metaTitleInput = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/form/div[3]/input");
    By metaDescription = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/form/div[4]/textarea");
    By saveButton = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/form/div[5]/button");
    By editButton = By.xpath(".//a[@title='Edit']");
    By deleteButton = By.xpath(".//a[@title='Delete']");
    By confirmDeleteButton = By.xpath("//*[@id=\"delete-link\"]");
    By cancelDeleteButton = By.xpath("//*[@id=\"delete-modal\"]/div/div/div[2]/button");


    public void searchBrand(String searchValue){
        WebUI.setTextAndKey(searchInput, searchValue, Keys.ENTER);
    }

    public void setNameInput(String nameValue) {
        WebUI.setText(nameInput, nameValue );
    }

    public void setLogoInput(String logoFilePath) {
        WebUI.setText(logoInput, logoFilePath);
    }

    public void setMetaTitleInput(String metaTitleValue) {
        WebUI.setText(metaTitleInput, metaTitleValue);
    }

    public void setMetaDescription(String metaDescriptionValue) {
        WebUI.setText(this.metaDescription, metaDescriptionValue);
    }

    public void clickSaveBtn(int timeout) {
        WebUI.clickElement(saveButton, timeout);
    }

    public void clickEditButton(int rowIndex) {
        List<WebElement> rows = DriverManager.getDriver().findElements(tableRows);
        WebElement row = rows.get(rowIndex);
        row.findElement(editButton).click();
    }

    public void clickDeleteButton(int rowIndex) {
//        List<WebElement> rows = DriverManager.getDriver().findElements(tableRows);
//        WebElement row = rows.get(rowIndex);
//        row.findElement(deleteButton).click();
    }

    public void clickConfirmDeleteButton(int timeout){
        WebUI.clickElement(confirmDeleteButton, timeout);
    }

    public void clickCancelDeleteButton(int timeout){
        WebUI.clickElement(cancelDeleteButton, timeout);
    }

    public String getBrandName(int rowIndex) {
        List<WebElement> rows = DriverManager.getDriver().findElements(tableRows);
        WebElement row = rows.get(rowIndex);
        return row.findElements(By.tagName("td")).get(1).getText();
    }
}
