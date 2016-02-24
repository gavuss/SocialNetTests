package com.authorization_test;

import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;
import com.tests_data.CoxErrorMessage;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;


/**
 * Created by silaev on 2/5/16.
 */
@Title("Авторизация")
public class SignInTest extends TestSignInData {

    @Test
    @Title("Авторизация phone/password")
    @Description("Позитивная авторизация используя связку phone/password")
    public void userSignInAccount() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        saveAllureScreenshot();
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        Assert.assertEquals(profilePage.coxHeaderBlock.coxRightMenu.exitLink.isDisplayed(), profilePage.coxHeaderBlock.coxRightMenu.exitLink.isDisplayed());
        saveAllureScreenshot();
    }

    /*

        @Test
        @Title("Авторизация phone/password негативная")
        @Description("Ввод телефона/логина \"null\"")
        public void userNullPhone() {
    //        saveImageAttach("Image attach");
            AuthorizePage authorizePage = new AuthorizePage(driver);
            authorizePage.authorizeForm.loginInput.sendKeys(nullUserPhone);
            authorizePage.authorizeForm.enterhButton.click();
            Assert.assertEquals(CoxErrorMessage.phoneError, authorizePage.getPhoneError());
        }

        @Test
        @Title("Авторизация phone/password негативная")
        @Description("Ввод телефона/логина менее 3-х символов")
        public void userTwoeSumbolPhone() {
            AuthorizePage authorizePage = new AuthorizePage(driver);
            authorizePage.authorizeForm.loginInput.sendKeys(twoSymbolPhone);
            authorizePage.authorizeForm.enterhButton.click();
            Assert.assertEquals(CoxErrorMessage.phoneError, authorizePage.getPhoneError());
        }
    */


}
