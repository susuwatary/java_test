package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.ContactData;

public class GroupAdderssTests extends TestBase {





    @Test
    public void GroupAdderssTests() {

        app.gotoAdders();
        app.getAdderessHelper().fillcontact(new ContactData("Alena", "Kob", "this address", "+71111111111", "exempl@dor.com"));
        app.getAdderessHelper().returnToAddres();
    }

   
}
