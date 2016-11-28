package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class AdderssCreationsTests extends TestBase {



    @Test
    public void testGroupAdderssTests() {

        gotoAdders();
        fillcontact(new GroupContact("Alena", "Kob", "this address", "+71111111111", "exempl@dor.com"));
        returnToAddres();
    }


}
