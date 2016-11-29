package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class AddressDelitionTests extends TestBase {


    
    @Test
    public void testAdsressDelitionTest() {
        app.getNavigationHelper().gotoAddressBook();
        app.getAddressHelp().creationsAddress();
        app.getAddressHelp().deliteAddress();
    }


}
