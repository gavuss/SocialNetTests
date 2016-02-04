package com.cox.pages.profile.elements.avatar;


import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 2/2/16.
 */
public class UserPersonAvaBlock extends HtmlElement {

    @Name("Форма добавленеи аватарки")
    @FindBy(css = ".cox-profile-menu-avatar")
    public  AddAvatarForm addAvatarForm;

    @Name("Кнопка \"Настройки профиля\"")
    @FindBy (css = ".person-ava__button a")
    public Link settingsLink;
}
