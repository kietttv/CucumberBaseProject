package project.com.pages;

import org.openqa.selenium.By;
import project.com.keywords.WebUI;

public class CategoryPage {
    By addNewCategoryBtn = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a");
    By searchInput = By.xpath("//*[@id=\"search\"]");
     By editBtn = By.xpath("(//a[@title='Edit'])[1]");

    public void clickAddNewCategoryBtn() {
        WebUI.clickElement(addNewCategoryBtn, 10);
    }

    public void searchCategory(String searchValue){
       WebUI.setText(searchInput, searchValue);
       WebUI.pressENTER();
    }

    public void clickEditBtn(){
        WebUI.clickElement(editBtn, 10);
    }
}
