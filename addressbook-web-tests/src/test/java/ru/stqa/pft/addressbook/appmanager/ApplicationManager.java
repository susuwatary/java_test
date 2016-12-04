package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by alena on 29.11.16.
 */
public class ApplicationManager {

    WebDriver wd;

    private SessionsHelper sessionsHelper;
    private NavigationHelper navigationHelper;
    private  AddressHelp addressHelp;
    private  GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        if (browser == BrowserType.FIREFOX) {
            wd = new FirefoxDriver();
        } else if (browser == BrowserType.CHROME) {
            wd = new ChromeDriver();
        } else if (browser == BrowserType.IE) {
            wd = new InternetExplorerDriver();
        }

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
