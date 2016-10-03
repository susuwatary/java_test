package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 04.10.16.
 */
public class NavigationsHelper {
   private FirefoxDriver wd;

    public NavigationsHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.name("new")).click();
    }
}
