package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ProductPage extends BasePage{

    public ProductPage(AppiumDriver driver){

        super(driver);

    }

    By title=AppiumBy.accessibilityId("title");

    public boolean verifyProductPage(){

        return isDisplayed(title);

    }

}