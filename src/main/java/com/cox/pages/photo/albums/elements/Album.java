package com.cox.pages.photo.albums.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

/**
 * Created by silaev on 2/25/16.
 */

@Name("Альбом")
@FindBy(css = ".cox-albums-album")
public class Album extends HtmlElement {

    @Name("Кнопка \"Удалить альбом\"")
    @FindBy (css = ".cox-albums-remove")
    public Button albumsRemove;

    @Name ("Счетчик фото в альбоме")
    @FindBy (css= ".albums__album__count-albums")
    public TextBlock photoCount;

    @Name("Имя альбома")
    @FindBy(css = ".albums__album__name")
    public TextBlock albumName;

    @Name("Описание альбома")
    @FindBy(css = ".albums__album__descr")
    public TextBlock albumDescr;


    public void albunRemove () {
        albumsRemove.click();
    }

    /*
    public void albumPhotoCount () {
        return Integer.valueOf(photoCount.getText());
    }
    */

    public String albumName () {
        return albumName.getText();
    }

    public String albumDescr () {
        return albumDescr.getText();
    }


}
