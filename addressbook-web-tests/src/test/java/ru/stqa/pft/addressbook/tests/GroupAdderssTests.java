package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupContsct;

public class GroupAdderssTests extends TestBase {





    @Test
    public void GroupAdderssTests() {

        app.gotoAdders();
        app.fillcontact(new GroupContsct("Alena", "Kob", "this address", "+71111111111", "exempl@dor.com"));
        app.returnToAddres();
    }

   
}
