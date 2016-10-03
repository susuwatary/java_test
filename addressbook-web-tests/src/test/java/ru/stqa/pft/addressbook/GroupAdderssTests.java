package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupAdderssTests extends TestBase {





    @Test
    public void GroupAdderssTests() {

        gotoAdders();
        fillcontact(new GroupContsct("Alena", "Kob", "this address", "+71111111111", "exempl@dor.com"));
        returnToAddres();
    }

   
}
