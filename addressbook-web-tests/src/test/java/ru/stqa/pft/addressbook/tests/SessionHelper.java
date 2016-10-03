package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 04.10.16.
 */
public class SessionHelper {
    FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }
    public void login(String username, String password) {
        wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("\\undefined");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }
}
