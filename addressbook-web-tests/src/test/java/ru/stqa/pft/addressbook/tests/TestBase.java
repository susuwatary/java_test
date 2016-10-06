package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicatorManader;

/**
 * Created by alena on 03.10.16.
 */
public class TestBase {

    protected final ApplicatorManader app = new ApplicatorManader(BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

    public ApplicatorManader getApp() {
        return app;
    }
}
