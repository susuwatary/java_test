package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.tests.SessionHelper;

import java.util.concurrent.TimeUnit;

/**
 * Created by alena on 04.10.16.
 */
public class ApplicatorManader {
    FirefoxDriver wd;
    private AdderessHelper adderessHelper;
    private SessionHelper sessionHelper;
    private NavigationsHelper navigationsHelper;
    private GroupHelper groupHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        navigationsHelper = new NavigationsHelper(wd);
        sessionHelper = new SessionHelper(wd);
        adderessHelper = new AdderessHelper(wd);
        sessionHelper.login("admin", "secret");
    }


    public void gotoAdders() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void gotoPageGroupe() {
        wd.findElement(By.linkText("groups")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationsHelper getNavigationsHelper() {
        return navigationsHelper;
    }

    public AdderessHelper getAdderessHelper() {
        return adderessHelper;
    }
}
