package com.cox.pages.cox.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 1/20/16.
 */
public class CoxHeaderBlock extends HtmlElement {

    @Name("Логотип COX")
    @FindBy(css = ".header__logo")
    public Link generalLink;

    @Name("Меню")
    @FindBy(css = ".g-nav")
    public CoxMenu coxMenu;

    @Name("Правое меню")
    @FindBy(css = ".header__right")
    public CoxRightMenu coxRightMenu;
}
