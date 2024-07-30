package project.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import project.com.keywords.WebUI;

public class CategoryPage {
    By addNewCategoryBtn = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a");
    By updateCategoryBtn = By.xpath("(//a[@title='Edit'])[1]");
    By searchInput = By.xpath("//*[@id=\"search\"]");
    By messageAlert = By.xpath("//span[@data-notify='message']");

    public void clickAddNewCategoryBtn() {
        WebUI.clickElement(addNewCategoryBtn, 10);
    }

    public void search(String searchValue){
        WebUI.setTextAndKey(searchInput, searchValue, Keys.ENTER);
    }

    public void clickUpdateBtn(){
        WebUI.clickElement(updateCategoryBtn, 10);
    }
}
