package com.cox.pages.photo;

import com.cox.pages.photo.albums.page.AlbumsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

/**
 * Created by silaev on 2/29/16.
 */
@FindBy(css = ".cox-popup")
public class DeleteAlbumPopUp extends HtmlElement {

    public WebDriver driver;

    @Name("Кнопка \"Закрыть\"")
    @FindBy(css = ".cox-popup-close")
    public Button coxPopupClose;

    @Name("Title PopUp")
    @FindBy (css = "Удаление альбома")
    public TextBlock popUpDeleteTitle;

    @Name("Все фотографии в альбоме будут удалены!")
    @FindBy (css = ".albums__createalbum__text:nth-child(2)")
    public TextBlock popUpDeleteText;

    @Name("Имя удаляемого альбома")
    @FindBy (css = ".albums__createalbum__text:nth-child(3)")
    public TextBlock popUpDeleteAlbumName;

    @Name("Кнопка \"Удалить\"")
    @FindBy (css= ".cox-albums-remove-album")
    public Button deleteAlbumButton;

    @Name("Кнопка \"Отмена\"")
    @FindBy(css = ".cox-albums-cancel-create")
    public Button albumsCancelCreate;

    public AlbumsPage deleteAlbum () {
        deleteAlbumButton.click();
        return new AlbumsPage(driver);
    }
}
