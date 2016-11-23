package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupData;

/**
 * Created by alena on 04.10.16.
 */
public class GroupModificationTest extends TestBase {
    @Test

    public void testGroupModifications() {
        app.getNavigationsHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().initGroupModifications();
        app.getGroupHelper().fillGroupForm(new GroupData("Test12", "Test3", "Test2"));
        app.getGroupHelper().SumbitGrouModification();
        app.getGroupHelper().returnGroupPaga();


    }
}
