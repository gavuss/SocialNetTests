package com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.concurrent.TimeUnit;

/**
 * Created by silaev on 1/20/16.
 */
public class GlobalTestSettings {
    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dev03.cox.ru/");
    }

   /* @After
    public void tearDown() {
        driver.close();
    }
*/
    @Attachment(value = "Page screenshot {0}", type = "image/png")
    public  byte[] saveAllureScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
