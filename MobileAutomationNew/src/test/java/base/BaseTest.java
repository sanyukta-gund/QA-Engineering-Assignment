package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public class BaseTest {

    @BeforeMethod
    public void setup() throws Exception {

        DriverFactory.initializeDriver();

    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();

    }

}