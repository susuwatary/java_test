package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupContact;

public class AdderssCreationsTests extends TestBase {



    @Test
    public void testGroupAdderssTests() {

        app.gotoAdders();
        app.fillcontact(new GroupContact("Alena", "Kob", "this address", "+71111111111", "exempl@dor.com"));
        app.returnToAddres();
    }


}
