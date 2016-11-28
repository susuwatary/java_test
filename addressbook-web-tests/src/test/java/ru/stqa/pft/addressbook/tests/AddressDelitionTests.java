package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class AddressDelitionTests extends TestBase {


    
    @Test
    public void testAdsressDelitionTest() {
        app.gotoAddressBook();
        app.creationsAddress();
        app.deliteAddress();
    }


}
