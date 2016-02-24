package com.cox.pages.profile.elements.photos;

import com.cox.pages.photo.albums.page.AlbumsPageLink;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

/**
 * Created by silaev on 2/24/16.
 */

public class UserPersonalPhotosBlock extends HtmlElement{

    @Name("Счётчик общиго числа фото")
    @FindBy (css = ".layout__value")
    public TextBlock photoCount;

    @Name("Все фото")
    @FindBy(css = ".layout__show-all")
    public AlbumsPageLink albumsPageLink;


}
