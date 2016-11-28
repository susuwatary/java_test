package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


import org.openqa.selenium.*;


public class GroupDelitonTest extends TestBase {


    
    @Test
    public void testGroupDelitonTest() {

        wd.findElement(By.linkText("groups")).click();
        SelectGroup();
        delitaSelectGroup();
        returnGroupPaga();    }


}
