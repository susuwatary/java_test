package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;


public class GroupCreationstests extends TestBase {

    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test12", "Test3", "Test2"));
        sumbitGroupCreation();
        returnGroupPaga();
    }

}
