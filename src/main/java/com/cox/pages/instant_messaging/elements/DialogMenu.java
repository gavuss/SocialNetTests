package com.cox.pages.instant_messaging.elements;

import net.thucydides.core.annotations.findby.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;


/**
 * Created by alexander on 2/8/16.
 */
public class DialogMenu extends HtmlElement {

    @Name("Кнопка \"Новый диалог\"")
    @FindBy(css = ".cox-new-chat")
    public Link createNewChatLink;

    @Name("Кнопка \"Все чаты\"")
    @FindBy(css = ".m-current[data-type-chat='all']")
    public Button allChatsButton;

    @Name("Кнопка \"Одиночные чаты\"")
    @FindBy(css = ".m-current[data-type-chat='single']")
    public Button singleChatsButton;

    @Name("Кнопка \"Групповые чаты\"")
    @FindBy(css = ".m-current[data-type-chat='group']")
    public Button groupChatsButton;

    @Name("Форма \"Поиск\"")
    @FindBy (css = ".cox-dialogs-search")
    public SearchForm searchForm;


    /*
    public CreateNewDialogPage openNewChat() {
        createNewChatLink.click();
        return new CreateNewDialogPage(getClass());
    }
    */
}
