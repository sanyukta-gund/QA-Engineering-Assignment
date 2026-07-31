package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "title")
    WebElement productsTitle;

    public boolean isInventoryPageDisplayed() {
        return productsTitle.isDisplayed();
    }

    public String getPageTitle() {
        return productsTitle.getText();
    }
}