package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by alena on 29.11.16.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification (){

        app.getNavigationHelper().gotoGroupPages();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Test12", "Test3", "Test2"));
        app.getGroupHelper().sumbitModifications();



    }
}
