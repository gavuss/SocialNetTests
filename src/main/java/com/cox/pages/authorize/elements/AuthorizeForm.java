package com.cox.pages.authorize.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by silaev on 1/20/16.
 */
//add comment
@Name("Форма Авторизации")
public class AuthorizeForm extends HtmlElement {

    @Name("Поле ввода phone/login")
    @FindBy(css = "#inputPhone")
    public TextInput loginInput;

    @Name("Кнопка \"Войти\" ")
    @FindBy (css = ".cox-signin")
    public Button enterhButton;

    @Name("Поле ввода password")
    @FindBy (css = "#inputPassword")
    public  TextInput passwdInput;

    @Name("Кнопка подтвержденеи пароля")
    @FindBy (css = ".cox-confirmpassword")
    public Button confirmPasswdButton;

    public void userAuthorize (String userPhone, String userPassword) {
        loginInput.sendKeys(userPhone);
        enterhButton.click();
        passwdInput.sendKeys(userPassword);
        confirmPasswdButton.click();
    }
}
