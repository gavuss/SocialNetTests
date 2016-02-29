package com.cox.pages.photo.view_album.page;

import com.cox.pages.cox.page.CoxPage;
import com.cox.pages.photo.DeleteAlbumPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by silaev on 2/20/16.
 */
public class ViewAlbumPage extends CoxPage {

    public ViewAlbumPage(WebDriver driver) {
        super(driver);
    }

    @Name("Загрузить изображение в альбом")
    @FindBy(css = ".cox-albums-upload")
    public Button addAlbumPhotoButton;

    //TODO: описать когда добавят функционал
    @Name("Сделать снимок с камеры")
    //TODO: найти правильный локатор
    @FindBy(css = "")
    public Button snapShot;

    @Name("Редактировать альбом")
    @FindBy(css = ".cox-albums-edit")
    public Button editAlbumButton;

    @Name("Удалить альбом")
    @FindBy(css = ".cox-albums-remove")
    public Button deleteAlbumButton;

    public DeleteAlbumPopUp openDeleteAlbumPopUp() {
        deleteAlbumButton.click();
        return HtmlElementLoader.create(DeleteAlbumPopUp.class, driver);
    }
}
