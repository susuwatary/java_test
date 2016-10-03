package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 04.10.16.
 */
public class HelperBase {
    public FirefoxDriver wd;

    public HelperBase(FirefoxDriver wd) {

        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
        click(locator);
    }
}
