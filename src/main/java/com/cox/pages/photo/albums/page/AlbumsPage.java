package com.cox.pages.photo.albums.page;

import com.cox.pages.cox.page.CoxPage;
import com.cox.pages.photo.albums.elements.NewAlbumPopUp;
import com.cox.pages.photo.albums.elements.SearchPhotos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumsPage extends CoxPage {

    private WebDriver driver;

    public AlbumsPage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populate(this, driver);
    }

    @Name("Поиск")
    @FindBy(css = ".m-search")
    public SearchPhotos searchPhotos;

    @Name("Кнопка \"Новый альбом\"")
    @FindBy(css = ".cox-albums-newalbum")
    public Button createAlbumButton;

    public NewAlbumPopUp openNewAlbumPopUp() {
        createAlbumButton.click();
        return HtmlElementLoader.create(NewAlbumPopUp.class, driver);
    }
}
