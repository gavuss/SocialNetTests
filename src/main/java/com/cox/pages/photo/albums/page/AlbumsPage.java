package com.cox.pages.photo.albums.page;

import com.cox.pages.cox.elements.CoxPopUp;
import com.cox.pages.photo.albums.elements.CreateAlbumLink;
import com.cox.pages.photo.albums.elements.SearchPhotos;
import com.cox.pages.cox.page.CoxPage;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumsPage extends CoxPage {

    @Name("Поиск")
    @FindBy(css=".m-search")
    public SearchPhotos searchPhotos;

    @Name("Кнопка \"Новый альбом\"")
    @FindBy (css = ".cox-albums-newalbum")
    public CreateAlbumLink createAlbumLink;

    public CoxPopUp createNewAlbum(){
        createAlbumLink.clickCreateAlbumButton();
        return new CoxPopUp();
    }
}
