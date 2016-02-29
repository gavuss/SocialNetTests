package com.cox.pages.cox.page;

import com.cox.pages.cox.elements.CoxHeaderBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by silaev on 1/20/16.
 */
public class CoxPage {

    public WebDriver driver;
    public CoxPage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populate(this, driver);
    }

    @Name("Блок навигации")
    @FindBy(css = ".header")
    public CoxHeaderBlock coxHeaderBlock;

   // @Name("")


}
