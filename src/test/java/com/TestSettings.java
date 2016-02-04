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

    String userPhone = "+79268355733";
    //String userPhone = "77778889955"; //для тестов на 6000 постов на стене
    String userPasswd = "123456";
    String wallMessage = "Всем стоять! Это ограбление!!!!";
    String wallComment = "Пост КГ/АМ, аффтор выпей йяду";

    //Авторизация (Негативная)
    String nullUserPhone = "";
    String twoSymbolPhone = "";

    //Ошибки на странице авторизации
    String phoneError = "Телефон/логин должен быть не менее 3 и не более 30 символов в длину";
    String passwdError = "Пароль должен быть не менее 6 символов";
    String smsError = "Код должен состоять из 4 цифр";
    String emailError;


    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dev03.cox.ru/");
    }

    @After
    public void tearDown (){
        driver.close();
    }


}
