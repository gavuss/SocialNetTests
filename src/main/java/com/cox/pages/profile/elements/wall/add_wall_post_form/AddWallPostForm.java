package com.cox.pages.profile.elements.wall.add_wall_post_form;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by silaev on 1/20/16.
 */
@Name("Форма добавления поста на стену")
public class AddWallPostForm extends HtmlElement {

    @Name("О чем вы думаете?")
    @FindBy(css = ".cox-field-new-post")
    public TextInput postInput;

    @Name("Кнопка \"Опубликовать\"")
    @FindBy(css = ".cox-profile-add-post")
    public Button addPostButton;

    //метод просто заолняет форму и возвращает нам объект AddWallPostForm с заполненным полем.
    public AddWallPostForm enterWallPost(String wallMessage) {
        postInput.sendKeys(wallMessage);
        return this;
    }

    public void clickAddPostButton() {
        addPostButton.click();
    }

}
