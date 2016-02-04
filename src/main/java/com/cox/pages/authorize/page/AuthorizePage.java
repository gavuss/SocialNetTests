package com.cox.pages.authorize.page;

import com.cox.pages.authorize.elements.AuthorizeForm;
import com.cox.pages.profile.page.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/**
 * Created by silaev on 1/20/16.
 */
public class AuthorizePage {
    private WebDriver driver;

    @Name("Форма авторизации")
    @FindBy(css = ".form-signin")
    public AuthorizeForm authorizeForm;

    @Name("Ошибка ввода: Телефона/Логина")
    @FindBy(css=".cox-phone-error")
    public TextBlock phoneError;

    @Name("Ошибка ввода: Пароль")
    @FindBy(css=".cox-password-error")
    public TextBlock passwdError;

    @Name("Ошибка ввода: SMS-Code")
    @FindBy(css=".cox-smscode-error")
    public TextBlock smsError ;

    @Name("Ошибка ввода: Email")
    @FindBy(css = "cox-emailcode-error")
    public TextBlock emailError;

    public AuthorizePage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }
    @Step("Авторизоваться")
    public ProfilePage userAuthorize(String userPhone, String userPasswd) {
        this.authorizeForm.userAuthorize(userPhone, userPasswd);
        return new ProfilePage(driver);
    }

    public AuthorizeForm getAuthorizeForm() {
        return authorizeForm;
    }

    public String getPhoneError () {
        return phoneError.getText();
    }
    public String getPasswdError () {
        return passwdError.getText();
    }

    public String getSmsError () {
        return smsError.getText();
    }

    public String getEmailError () {
        return emailError.getText();
    }
}
