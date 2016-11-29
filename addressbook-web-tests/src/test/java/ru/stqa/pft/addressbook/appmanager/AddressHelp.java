package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupContact;

/**
 * Created by alena on 29.11.16.
 */
public class AddressHelp {
    private FirefoxDriver wd;

    public AddressHelp(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void fillcontact(GroupContact groupContsct) {
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

    public void deliteAddress() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }

    public void creationsAddress() {
        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
    }
}
