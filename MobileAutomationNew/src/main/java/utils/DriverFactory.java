package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

//public class DriverFactory {
//
//    public static AppiumDriver driver;
//
//    public static AppiumDriver getDriver() throws MalformedURLException {
//
//    	
//        if (driver == null) {
//
//        	UiAutomator2Options options = new UiAutomator2Options();
//
//        	options.setPlatformName("Android");
//        	options.setAutomationName("UiAutomator2");
//        	options.setDeviceName("emulator-5554");
//        	options.setPlatformVersion("14");
//
//        	options.setApp("C:\\Users\\sanyu\\Downloads\\mda-2.2.0-25.apk");
//
//        	driver = new AndroidDriver(
//        	        new URL("http://127.0.0.1:4723"),
//        	        options);
//
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        }
//
//        return driver;
//    }
//
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//}
public class DriverFactory {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void initializeDriver() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");
        options.setPlatformVersion("14");
        options.amend("appium:uiautomator2ServerLaunchTimeout", 120000);
        options.amend("appium:adbExecTimeout", 120000);
//        options.setApp("C:\\Users\\sanyu\\Downloads\\mda-2.2.0-25.apk");
        options.setAppPackage("com.saucelabs.mydemoapp.android");
        options.setAppActivity(".view.activities.SplashActivity");
        options.setNoReset(true);
        options.setAutoGrantPermissions(true);
        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quitDriver() {

        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}