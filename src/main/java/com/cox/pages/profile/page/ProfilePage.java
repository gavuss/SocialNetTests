package com.cox.pages.profile.page;

import com.cox.pages.cox.page.CoxPage;
import com.cox.pages.profile.elements.avatar.UserPersonAvaBlock;
import com.cox.pages.profile.elements.profile_menu.ProfileMenuBlock;
import com.cox.pages.profile.elements.wall.UserPersonalWallBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/**
 * Created by silaev on 1/20/16.
 */
public class ProfilePage extends CoxPage {

    public ProfilePage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }


    /*
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }
    */

    /*@Name("Песрсональная информация")
    @FindBy(".cox-block-view")
    public UserPersonInfoBlock userPersonInfoBlock;
    */

    @Name ("Стена")
    @FindBy(css =".cox-profile-wall-block")
    public UserPersonalWallBlock userPersonalWallBlock;

    @Name ("Аватар")
    @FindBy(css =".person-ava")
    public UserPersonAvaBlock userPersonAvaBlock;

    /*
    @Name ("Друзья")
    @FindBy(css =".cox-profile-friends-block")
    public UserPersonFriendsBlock userPersonFriendsBlock;

    @Name ("Мои фотографии")
    @FindBy(css =".cox-profile-photos-block")
    public UserPersonalPhotosBlock userPersonalPhotosBlock;

    @Name ("Мои видеозаписи")
    @FindBy(css =".cox-profile-videos-block")
    public UserPersonalVideosBlock userPersonalVideosBlock;

    @Name ("")
    @FindBy(css =".")
    public ;
    */

    @Name ("Меню")
    @FindBy(css =".sub-nav")
    public ProfileMenuBlock profileMenuBlock;


    @Step("Добавить пост на стену")
    public void addWallPost (String wallMessage) {
        userPersonalWallBlock.addWallPostForm.enterWallPost(wallMessage).clickAddPostButton();
    }

    @Step("Добавить комментарий")
    public void addComment (String wallComment) {
        userPersonalWallBlock.wallPostList.get(0).enterWallComment(wallComment).addWallComment();
    }

    @Step("Удалить пост")
    public void deletePost () {
        userPersonalWallBlock.wallPostList.get(0).deleteWallPost();
    }
}
