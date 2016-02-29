package com.cox.pages.photo.albums.page;

import com.cox.pages.cox.page.CoxPage;
import com.cox.pages.photo.albums.elements.Album;
import com.cox.pages.photo.albums.elements.NewAlbumPopUp;
import com.cox.pages.photo.albums.elements.SearchPhotos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumsPage extends CoxPage {

    //private WebDriver driver;

    public AlbumsPage(WebDriver driver) {
        super(driver);
    }


    @Name("Поиск")
    @FindBy(css = ".m-search")
    public SearchPhotos searchPhotos;

    @Name("Кнопка \"Новый альбом\"")
    @FindBy(css = ".cox-albums-newalbum")
    public Button createAlbumButton;

    //TODO: сделать UploadPopUp
    @Name("Кнопка \"Загрузить изображение\"")
    @FindBy (css = ".cox-albums-upload")
    public Button uploadPopUp;

    //TODO: описать когда добавят функционал
    @Name("Кнопка \"Сделать снимок с камеры\"")
    //TODO: найти правильный локатор
    @FindBy (css = "")
    public Button snapShot;

    @Name("Показать все альбомы")
    @FindBy (css = ".cox-albums-loading-albums")
    public HtmlElement allAlbums;

    @Name("Список альбомов")
    @FindBy (css = ".cox-albums-album")
    public List<Album> album;


    public NewAlbumPopUp openNewAlbumPopUp() {
        createAlbumButton.click();
        return HtmlElementLoader.create(NewAlbumPopUp.class, driver);
    }

    public void showAllAlbums () {
        allAlbums.click();
    }

    public void allbumsCount () {
        allAlbums.getText();
    }


}
