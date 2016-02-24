package com.photo_test;

import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;
import org.junit.Test;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumTest extends TestCreateAlbumData{

    @Test
    public void OpenAlbumsPage () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        saveAllureScreenshot();
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage().createNewAlbum().createAlbum(albumName, albumPrivacy, albumDescr);

    }
}
