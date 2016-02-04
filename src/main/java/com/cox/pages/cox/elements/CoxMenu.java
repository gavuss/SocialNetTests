package com.cox.pages.cox.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 1/20/16.
 */
public class CoxMenu extends HtmlElement {

    @Name("Профиль")
    @FindBy(css = ".nav__item[navbar-item=\"profile\"]")
    public Link profileLink;

    @Name("Сообщения")
    @FindBy(css = ".nav__item[navbar-item=\"im\"]")
    public Link imLink;

    @Name("Маркет")
    @FindBy(css = ".nav__item[navbar-item=\"market\"]")
    public Link marketLink;

    @Name("Приложения")
    @FindBy(css = ".nav__item[navbar-item=\"app\"]")
    public Link appLink;

    /*
    public  clickAddPostButton() {
        addPostButton.click();
    }
    */

}
