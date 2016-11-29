package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupContact;

/**
 * Created by alena on 29.11.16.
 */
public class AddressModificationsTests extends TestBase {

    @Test
    public void testAddressModifications(){

        app.getNavigationHelper().gotoAddressBook();
        app.getAddressHelp().creationsAddress();
        app.getAddressHelp().fillcontact(new GroupContact("Alena2", "Kin", "this address", "+71111111111", "exempl@dor.com"));
        app.getGroupHelper().sumbitModifications();

    }
}
