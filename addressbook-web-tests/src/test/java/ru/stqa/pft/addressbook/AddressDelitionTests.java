package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class AddressDelitionTests extends TestBase {


    
    @Test
    public void testAdsressDelitionTest() {
        gotoAddressBook();
        creationsAddress();
        deliteAddress();
    }


}
