package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


import org.openqa.selenium.*;


public class GroupDelitonTest extends TestBase {


    
    @Test
    public void testGroupDelitonTest() {

        gotoGroupPages();
        SelectGroup();
        delitaSelectGroup();
        returnGroupPaga();
    }


}
