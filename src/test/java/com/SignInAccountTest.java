package com;

import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.URL;

/**
 * Created by silaev on 1/20/16.
 */
@Title("Авторизация")
public class SignInAccountTest extends TestSettings {

    @Test
    @Title("Авторизация phone/password")
    @Description("Позитивная авторизация используя связку phone/password")
    public void userSignInAccount() {

        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPasswd);

    }

    @Test
    @Title("Авторизация phone/password негативная")
    @Description("Ввод телефона/логина \"null\"")
    public void userNullPhone () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        authorizePage.authorizeForm.loginInput.sendKeys(nullUserPhone);
        authorizePage.authorizeForm.enterhButton.click();
        Assert.assertEquals(phoneError, authorizePage.getPhoneError());
    }

    @Test
    @Title("Авторизация phone/password негативная")
    @Description("Ввод телефона/логина менее 3-х символов")
    public void userTwoeSumbolPhone () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        authorizePage.authorizeForm.loginInput.sendKeys(twoSymbolPhone);
        authorizePage.authorizeForm.enterhButton.click();
        Assert.assertEquals(phoneError, authorizePage.getPhoneError());
    }


}
