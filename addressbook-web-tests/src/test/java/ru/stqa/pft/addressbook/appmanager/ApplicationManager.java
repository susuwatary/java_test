package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by alena on 29.11.16.
 */
public class ApplicationManager {

    FirefoxDriver wd;

    private SessionsHelper sessionsHelper;
    private NavigationHelper navigationHelper;
    private  AddressHelp addressHelp;
    private  GroupHelper groupHelper;



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
        addressHelp = new AddressHelp(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionsHelper = new SessionsHelper(wd);
        sessionsHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public AddressHelp getAddressHelp() {
        return addressHelp;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionsHelper getSessionsHelper() {
        return sessionsHelper;
    }
}
