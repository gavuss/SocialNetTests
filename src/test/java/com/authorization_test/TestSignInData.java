package com.authorization_test;

import com.TestSettings;
import org.openqa.selenium.WebDriver;

/**
 * Created by silaev on 2/4/16.
 */
public class TestSignInData extends TestSettings{

    //Позитивная авторизация
    String userPhone = "79268355733";
    String userPassword = "123456";

    //Негативная авторизация авторизация
    String nullUserPhone = "";
    String twoSymbolPhone = "12";


}

