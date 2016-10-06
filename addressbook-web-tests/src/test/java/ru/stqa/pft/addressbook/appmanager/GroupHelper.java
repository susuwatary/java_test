package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.GroupData;

/**
 * Created by alena on 04.10.16.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnGroupPaga() {
        click(By.linkText("group page"));
    }

    public void sumbitGroupCreation() {
        click(By.cssSelector("div.msgbox"));

    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
        click(By.name("submit"));

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

    public void initGroupModifications() {
        click(By.name("edit"));
    }

    public void SumbitGrouModification() {
        click(By.name("update"));
    }
}
