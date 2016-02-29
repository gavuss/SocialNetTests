package com.wall_test;


import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by silaev on 1/25/16.
 */

@Title("Стена")
public class WallTest extends TestWallData {

    @Test
    @Title("Добавление поста")
    @Description("Позитивное")
    public void userAddWallPost() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        saveAllureScreenshot();
        profilePage.addWallPost(wallMessage);
        saveAllureScreenshot();
    }

    @Test
    @Title("Удаление поста со стены")
    public void userDeleteWallPost() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);

        profilePage.deletePost(deletePostNumber);
        saveAllureScreenshot();
    }

    @Test
    @Title("Добавление коммента к посту")
    public void userAddCommitAtWall() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.addComment(wallComment, addCommentPostNumber);
    }


}
