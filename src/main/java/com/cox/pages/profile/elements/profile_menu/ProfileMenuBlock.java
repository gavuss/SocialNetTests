package com.cox.pages.profile.elements.profile_menu;

import com.cox.pages.profile.page.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 1/27/16.
 */
public class ProfileMenuBlock extends HtmlElement {

    @Name("Профиль")
    @FindBy(css = "href=\"/profile/\"")
    public Link profileLink;

     public ProfilePage clickProfileLink (WebDriver driver) {
        profileLink.click();
        return new ProfilePage(driver);

    }
}
