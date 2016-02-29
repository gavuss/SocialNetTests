package com.cox.pages.profile.elements.wall.wall_post;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by silaev on 1/20/16.
 */
@Name("Пост")
@FindBy(css = ".cox-post")
public class WallPost extends HtmlElement {

    @Name("Кнопка \"Удалить пост\"")
    @FindBy(css = ".cox-profile-delete-post")
    public Button deleteWallPostButton;

    @Name("Кнопка \"Редактировать пост\"")
    @FindBy(css = ".cox-profile-edit")
    public Button editWallPostButton;

    @Name("Поле ввода комментария")
    @FindBy (css =".cox-field-new-comment")
    public TextInput inputWallComment;

    @Name("Кнопка \"Добавить коммент\"")
    @FindBy(css = ".cox-profile-add-comment")
    public Button addWallCommentButton;

    public WallPost enterWallComment(String wallComment) {
        inputWallComment.sendKeys(wallComment);
        return this;
    }

    public void addWallComment() {
        addWallCommentButton.click();
    }

    public void deleteWallPost() {
        deleteWallPostButton.click();
    }

    public void editWallPost() {
        editWallPostButton.click();
    }


}
