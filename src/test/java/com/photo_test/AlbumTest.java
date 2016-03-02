package com.photo_test;

import com.cox.pages.authorize.page.AuthorizePage;
import com.cox.pages.profile.page.ProfilePage;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumTest extends TestAlbumData {

    @Test
    @Title("Создание альбома")
    public void createAlbum() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage(driver).openNewAlbumPopUp().createAlbum(albumName, albumPrivacy, albumDescr);
    }

    @Test
    @Title ("Закрытие ПопАп")
    public void closeCreateAlbumPopUp() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage(driver).openNewAlbumPopUp().coxPopupClose.click();
    }

    @Test
    @Title("Просмотор альбома")
    public void viewAlbum() {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage(driver).album.get(albumNumber).click();
    }

    @Test
    @Title("Удаление альбома")
    public void deleteAlbum () {
        AuthorizePage authorizePage = new AuthorizePage(driver);
        ProfilePage profilePage = authorizePage.userAuthorize(userPhone, userPassword);
        profilePage.openAlbumsPage(driver).album.get(albumNumber).openAlbum().openDeleteAlbumPopUp().deleteAlbum();

    }

}
