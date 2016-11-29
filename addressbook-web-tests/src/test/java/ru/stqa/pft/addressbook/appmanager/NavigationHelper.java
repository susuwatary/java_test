package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 29.11.16.
 */
public class NavigationHelper extends HelperBase {


    public NavigationHelper(FirefoxDriver wd) {
        super(wd);;
    }

    public void gotoGroupPage() {
        click(By.name("new"));
    }

    public void gotoGroupPages() {
        click(By.linkText("groups"));
    }

    public void gotoAdders() {
        click(By.linkText("add new"));
    }

    public void gotoAddressBook() {
        wd.get("http://localhost/addressbook/index.php");
    }
}
