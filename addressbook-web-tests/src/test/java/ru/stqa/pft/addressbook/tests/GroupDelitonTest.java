package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDelitonTest extends TestBase {


    
    @Test
    public void testGroupDelitonTest() {

        app.gotoGroupPages();
        app.SelectGroup();
        app.delitaSelectGroup();
        app.returnGroupPaga();
    }


}
