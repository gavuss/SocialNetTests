package com.cox.pages.profile.elements.wall;

import com.cox.pages.profile.elements.wall.add_wall_post_form.AddWallPostForm;
import com.cox.pages.profile.elements.wall.wall_post.WallPostItem;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

/**
 * Created by silaev on 1/20/16.
 */
public class UserPersonalWallBlock extends HtmlElement{

    @Name("Форма добавленеи поста на стену")
    @FindBy(css = ".cox-post-edit")
    public AddWallPostForm addWallPostForm;

    @Name("Списко постов на стене")
    @FindBy(css = ".cox-wall-posts")
    public List<WallPostItem> wallPostList;



}
