package com.photo_test;

import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumTest extends TestCreateAlbumData{

    @Test
    public void OpenAlbumsPage () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage(driver).openNewAlbumPopUp().createAlbum(albumName, albumPrivacy, albumDescr);
    }

    @Test
    public void OpenAlbum () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage(driver).allAlbums.click().album.get(i).click();
    }
}
