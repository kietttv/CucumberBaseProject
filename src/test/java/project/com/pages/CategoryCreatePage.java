package project.com.pages;

import org.openqa.selenium.By;
import project.com.keywords.WebUI;

public class CategoryCreatePage {
    By nameInput = By.xpath("//*[@id=\"name\"]");
    By categoryParent = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[2]/div/div/button");
    By orderingNumberInput = By.xpath("//*[@id=\"order_level\"]");
    By type = By.xpath("//*[@id=\"order_level\"]");
    By banner = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[5]/div/div[1]");
    By icon = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[6]/div/div[1]");
    By metaTitleInput = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[7]/div/input");
    By metaDescriptionTextArea = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[8]/div/textarea");
    By filteringAttributes = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[9]/div/div/button");
    By saveBtn = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/form/div[10]/button");

    public void setName(String nameValue) {
        WebUI.setText(nameInput, nameValue);
    }

    public void setParentCategory(String cateParentValue) {
        // Implementation for setting the parent category
    }

    public void setOrderingNumber(String orderingNumberValue) {
        WebUI.setText(orderingNumberInput, orderingNumberValue);
    }

    public void setType(String typeValue) {
        // Implementation for setting the type
    }

    public void setBanner(String bannerValue) {
        // Implementation for setting the banner
    }

    public void setIcon(String iconValue) {
        // Implementation for setting the icon
    }

    public void setMetaTitle(String metaTitleValue) {
        WebUI.setText(metaTitleInput, metaTitleValue);
    }

    public void setMetaDescription(String metaDescriptionValue) {
        WebUI.setText(metaDescriptionTextArea, metaDescriptionValue);
    }

    public void setFilteringAttributes(String filteringAttributesValue) {
        // Implementation for setting the filtering attributes
    }

    public void clickSaveBtn(){
        WebUI.clickElement(saveBtn, 10);
    }
}
