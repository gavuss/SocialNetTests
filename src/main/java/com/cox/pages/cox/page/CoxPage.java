package com.cox.pages.cox.page;

import com.cox.pages.cox.elements.CoxHeaderBlock;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;

/**
 * Created by silaev on 1/20/16.
 */
public class CoxPage {
    @Name("Блок навигации")
    @FindBy(css = ".header")
    public CoxHeaderBlock coxHeaderBlock;

   // @Name("")


}
