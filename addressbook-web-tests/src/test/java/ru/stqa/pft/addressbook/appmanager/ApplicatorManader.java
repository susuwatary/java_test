package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.GroupContsct;
import ru.stqa.pft.addressbook.tests.SessionHelper;

import java.util.concurrent.TimeUnit;

/**
 * Created by alena on 04.10.16.
 */
public class ApplicatorManader extends AdderessHelper {
    FirefoxDriver wd;

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
        sessionHelper.login("admin", "secret");
    }



    public void fillcontact(GroupContsct groupContsct) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(groupContsct.getName());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(groupContsct.getLastname());
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(groupContsct.getAddress());
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(groupContsct.getTel());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(groupContsct.getEmail());
    }

    public void returnToAddres() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
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
}
