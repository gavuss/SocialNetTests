package com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by silaev on 1/20/16.
 */
public class TestSettings {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dev03.cox.ru/");
    }

    String userPhone = "+79268355733";
    //String userPhone = "77778889955"; //для тестов на 6000 постов на стене
    String userPassword = "123456";
    String wallMessage = "Всем стоять! Это ограбление!!!!";
    String wallComment = "Пост КГ/АМ, аффтор выпей йяду";

    @After
    public void tearDown (){
        driver.close();
    }


}
