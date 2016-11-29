package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by alena on 29.11.16.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }


    public void returnGroupPaga() {
        click(By.linkText("group page"));
    }

    public void sumbitGroupCreation() {
        click(By.name("submit"));
        click(By.cssSelector("div.msgbox"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

    }

    public void initGroupCreation() {
        click(By.name("group_name"));
    }

    public void delitaSelectGroup() {
        click(By.name("delete"));
    }

    public void SelectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void sumbitModifications() {
        click(By.name("update"));
    }
}
