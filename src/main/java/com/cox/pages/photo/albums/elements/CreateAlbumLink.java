package com.cox.pages.photo.albums.elements;

import com.cox.pages.cox.elements.CoxPopUp;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 2/24/16.
 */
public class CreateAlbumLink extends Link {
    /**
     * Specifies wrapped {@link WebElement}.
     *
     * @param wrappedElement {@code WebElement} to wrap.
     */
    public CreateAlbumLink(WebElement wrappedElement) {
        super(wrappedElement);
    }

    public CoxPopUp clickCreateAlbumButton () {
        this.click();
        return new CoxPopUp();
    }
}
