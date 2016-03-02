package com.cox.pages.photo.albums.elements;

import com.cox.pages.photo.view_album.page.ViewAlbumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by silaev on 2/24/16.
 */
@FindBy (css = ".cox-popup")
public class NewAlbumPopUp extends HtmlElement {

    @Name("Кнопка \"Закрыть\"")
    @FindBy(css = ".cox-popup-close")
    public Button coxPopupClose;

    @Name("Название альбома")
    @FindBy(css = ".cox-albums-name")
    public TextInput albumsName;

    @Name("Кому виден этот альбом")
    @FindBy(css = ".cox-albums-privacy")
    public Select albumsPrivacy;

    @Name("Описание альбома")
    @FindBy(css = ".cox-albums-descr")
    public TextInput albumsDescr;

    @Name("Кнопка \"Создать\"")
    @FindBy(css = ".cox-albums-create-album")
    public Button albumsCreate;

    @Name("Кнопка \"Отмена\"")
    @FindBy(css = ".cox-albums-cancel-create")
    public Button albumsCancelCreate;

    @Step ("Добавить альбом")
    public void createAlbum (String albumName, String albumPrivacy,String albumDescr) {
        albumsName.sendKeys(albumName);
        albumsPrivacy.selectByVisibleText(albumPrivacy);
        albumsDescr.sendKeys(albumDescr);
        albumsCreate.click();
    }
    public void closePopUp () {
        coxPopupClose.click();
    }

    public void cancelPopUp () {
        albumsCancelCreate.click();
    }

}
