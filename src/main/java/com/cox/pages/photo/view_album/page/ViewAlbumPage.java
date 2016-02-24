package com.cox.pages.photo.view_album.page;

import com.cox.pages.cox.page.CoxPage;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by silaev on 2/20/16.
 */
public class ViewAlbumPage extends CoxPage {

    public ViewAlbumPage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }
}
