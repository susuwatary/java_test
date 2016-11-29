package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDelitonTest extends TestBase {


    
    @Test
    public void testGroupDelitonTest() {

        app.getNavigationHelper().gotoGroupPages();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().delitaSelectGroup();
        app.getGroupHelper().returnGroupPaga();
    }


}
