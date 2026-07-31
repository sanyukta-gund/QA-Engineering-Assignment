package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends BasePage{

    public LoginPage(AppiumDriver driver){

        super(driver);

    }

    By email=AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET");

    By password=AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET");

    By loginBtn=AppiumBy.accessibilityId("Tap to login with given credentials");

    public void login(String user,String pass){

        type(email,user);
        type(password,pass);
        click(loginBtn);

    }

}