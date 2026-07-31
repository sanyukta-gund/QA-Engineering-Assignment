package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    public static void captureScreenshot(String testName) {

        try {

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
                    .format(new Date());

            File source = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.FILE);

            File destination = new File(
                    "screenshots/" + testName + "_" + timestamp + ".png");

            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot saved at: "
                    + destination.getAbsolutePath());

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}