package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utils.DriverFactory;

public class LoginTest extends BaseTest{

    @Test

    
    public void verifySuccessfulLogin(){

        HomePage home=new HomePage(DriverFactory.getDriver());

        LoginPage login=new LoginPage(DriverFactory.getDriver());

        ProductPage product=new ProductPage(DriverFactory.getDriver());

        home.openLogin();

        login.login("bob@example.com","10203040");

        Assert.assertTrue(product.verifyProductPage());

    }

}