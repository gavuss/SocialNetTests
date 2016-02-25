package com.cox.pages.profile.page;

import com.cox.pages.photo.albums.page.AlbumsPage;
import com.cox.pages.cox.page.CoxPage;
import com.cox.pages.profile.elements.avatar.UserPersonAvaBlock;
import com.cox.pages.profile.elements.photos.UserPersonalPhotosBlock;
import com.cox.pages.profile.elements.profile_menu.ProfileMenuBlock;
import com.cox.pages.profile.elements.wall.UserPersonalWallBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

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

    @Name("Стена")
    @FindBy(css = ".cox-profile-wall-block")
    public UserPersonalWallBlock userPersonalWallBlock;

    @Name("Аватар")
    @FindBy(css = ".person-ava")
    public UserPersonAvaBlock userPersonAvaBlock;

    /*
    @Name ("Друзья")
    @FindBy(css =".cox-profile-friends-block")
    public UserPersonFriendsBlock userPersonFriendsBlock;
    */

    @Name("Мои фотографии")
    @FindBy(css = ".cox-profile-photos-block")
    public UserPersonalPhotosBlock userPersonalPhotosBlock;
    /*
    @Name ("Мои видеозаписи")
    @FindBy(css =".cox-profile-videos-block")
    public UserPersonalVideosBlock userPersonalVideosBlock;

    @Name ("")
    @FindBy(css =".")
    public ;
    */

    @Name("Меню")
    @FindBy(css = ".sub-nav")
    public ProfileMenuBlock profileMenuBlock;


    @Step("Добавить пост на стену")
    public void addWallPost(String wallMessage) {
        userPersonalWallBlock.addWallPostForm.enterWallPost(wallMessage).clickAddPostButton();
    }

    @Step("Добавить комментарий")
    public void addComment(String wallComment, int n) {
        userPersonalWallBlock.wallPostList.get(n).enterWallComment(wallComment).addWallComment();
    }

    //TODO: перделай метод как тут описано http://automated-testing.info/t/rabota-s-sobytiyami-v-selenium/1861/5
    @Step("Удалить пост")
    public void deletePost() {
        userPersonalWallBlock.wallPostList.get(0).deleteWallPost();
    }

    @Step("Открыть страницу \"Альбомы\"")
    public AlbumsPage openAlbumsPage (WebDriver driver) {
        userPersonalPhotosBlock.albumsPageLink.clickAlbumsPageLink(driver);
        return new AlbumsPage(driver);
    }
}
