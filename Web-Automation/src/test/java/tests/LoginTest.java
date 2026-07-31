package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test(priority = 1)
    public void validLoginTest() {

        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(),
                "Inventory page is not displayed");

        Assert.assertEquals(inventoryPage.getPageTitle(), "Products");
    }

    @Test(priority = 2)
    public void lockedUserLoginTest() {

        loginPage.login("locked_out_user", "secret_sauce");

        String actualError = loginPage.getErrorMessage();

        String expectedError =
                "Epic sadface: Sorry, this user has been locked out.";

        Assert.assertEquals(actualError, expectedError);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}