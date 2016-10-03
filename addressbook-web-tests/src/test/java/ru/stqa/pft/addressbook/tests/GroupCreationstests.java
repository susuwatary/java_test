package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupData;


public class GroupCreationstests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test12", "Test3", "Test2"));
        app.sumbitGroupCreation();
        app.returnGroupPaga();
    }

}
