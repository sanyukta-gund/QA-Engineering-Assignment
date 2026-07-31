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

    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.getDriver();

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test(priority = 1, description = "Test Case A (Success Path): Login with standard_user")
    public void verifySuccessfulLogin() {

        // Login with valid credentials
        loginPage.login("standard_user", "secret_sauce");

        // Verify user is redirected to Inventory page
        Assert.assertTrue(
                inventoryPage.isInventoryPageDisplayed(),
                "User was not redirected to the inventory/catalog page.");

        System.out.println("=================================================");
        System.out.println("Test Case A Passed");
        System.out.println("User successfully redirected to Inventory Page.");
        System.out.println("=================================================");
    }

    @Test(priority = 2, description = "Test Case B (Failure Path): Login with locked_out_user")
    public void verifyLockedOutUserLogin() {

        // Login with locked user credentials
        loginPage.login("locked_out_user", "secret_sauce");

        // Get actual error message from UI
        String actualError = loginPage.getErrorMessage();

        // Expected error message
        String expectedError =
                "Epic sadface: Sorry, this user has been locked out.";

        // Print message in console
        System.out.println("=================================================");
        System.out.println("Actual Error Message : " + actualError);
        System.out.println("Expected Error Message : " + expectedError);
        System.out.println("=================================================");

        // Verify error message
        Assert.assertEquals(
                actualError,
                expectedError,
                "Incorrect error message displayed for locked out user.");

        System.out.println("Test Case B Passed");
        System.out.println("Locked user error message verified successfully.");
        System.out.println("=================================================");
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}