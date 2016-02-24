package com.cox.pages.photo.albums.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by silaev on 2/24/16.
 */
public class AlbumsPageLink extends Link {

    public AlbumsPageLink(WebElement wrappedElement) {
        super(wrappedElement);
    }

   public AlbumsPage clickAlbumsPageLink (WebDriver driver) {
       this.click();
       return new AlbumsPage(driver);
    }
}
