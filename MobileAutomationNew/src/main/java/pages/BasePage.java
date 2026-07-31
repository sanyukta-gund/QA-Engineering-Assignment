package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import utils.WaitUtils;

public class BasePage {

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver){

        this.driver=driver;

    }

    public void click(By locator){

        WaitUtils.waitForElement(locator);

        driver.findElement(locator).click();

    }

    public void type(By locator,String value){

        WaitUtils.waitForElement(locator);

        driver.findElement(locator).sendKeys(value);

    }

    public boolean isDisplayed(By locator){

        WaitUtils.waitForElement(locator);

        return driver.findElement(locator).isDisplayed();

    }

}