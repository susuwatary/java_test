package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationsHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test12", null, null));
        app.getGroupHelper().sumbitGroupCreation();
        app.getGroupHelper().returnGroupPaga();
    }

}
