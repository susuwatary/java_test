package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 29.11.16.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.name("new")).click();
    }

    public void gotoGroupPages() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void gotoAdders() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void gotoAddressBook() {
        wd.get("http://localhost/addressbook/index.php");
    }
}
