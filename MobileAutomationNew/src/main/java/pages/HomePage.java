package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HomePage extends BasePage{

    public HomePage(AppiumDriver driver){
        super(driver);
    }

    By menu=AppiumBy.accessibilityId("View menu");
    By login=AppiumBy.accessibilityId("Login Menu Item");

    public void openLogin(){

        click(menu);
        click(login);

    }

}