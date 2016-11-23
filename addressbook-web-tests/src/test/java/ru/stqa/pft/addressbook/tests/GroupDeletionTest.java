package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase {


    
    @Test
    public void GroupDelitonTest() {

        app.gotoPageGroupe();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().delitaSelectGroup();
        app.getGroupHelper().returnGroupPaga();    }


}
