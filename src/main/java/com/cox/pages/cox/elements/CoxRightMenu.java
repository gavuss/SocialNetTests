package com.cox.pages.cox.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 1/20/16.
 */
public class CoxRightMenu extends HtmlElement {
    //TODO: описать это меню, когда появится
    @Name("?????")
    @FindBy(css = ".header__person")
    public HtmlElement headerPersonMenu;

    @Name("Выбор языка")
    @FindBy(css = ".m-lang")
    public Link languageLink;

    @Name("Настройки")
    @FindBy(css = ".header__control:nth-child(3)")
    public Link settingsLink;

    @Name("Выход")
    @FindBy(css = ".cox_do_logout")
    public Link exitLink;
}
