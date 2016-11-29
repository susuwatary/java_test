package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by alena on 29.11.16.
 */
public class GroupHelper {
   private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd = wd;
    }


    public void returnGroupPaga() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void sumbitGroupCreation() {
        wd.findElement(By.cssSelector("div.msgbox")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
        wd.findElement(By.name("submit")).click();
    }

    public void initGroupCreation() {
        wd.findElement(By.name("group_name")).click();
    }

    public void delitaSelectGroup() {
        wd.findElement(By.name("delete")).click();
    }

    public void SelectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
}
