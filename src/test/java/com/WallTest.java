package com;

import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by silaev on 1/25/16.
 */

@Title("Стена")
public class WallTest extends TestSettings {

    @Title("Добавление поста")
    @Description("Позитивное")
    @Test
    public void userAddWallPost() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone,userPasswd);
        profilePage.addWallPost(wallMessage);
    }

    @Title("Добавление коммента к посту")
    @Test
    public void userAddCommitAtWall () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone,userPasswd);
        profilePage.addComment(wallComment);
    }

    @Title("Удаление поста со стены")
    @Test
    public void userDeleteWallPost() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone,userPasswd);
        profilePage.deletePost();
    }


}
