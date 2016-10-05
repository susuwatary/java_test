package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 04.10.16.
 */
public class NavigationsHelper extends HelperBase {

    public NavigationsHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {

        click(By.name("new"));
    }
}
