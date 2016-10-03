package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupData;


public class GroupCreationstests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationsHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test12", "Test3", "Test2"));
        app.getGroupHelper().sumbitGroupCreation();
        app.getGroupHelper().returnGroupPaga();
    }

}
