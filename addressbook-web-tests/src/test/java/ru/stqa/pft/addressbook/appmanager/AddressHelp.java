package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupContact;

/**
 * Created by alena on 29.11.16.
 */
public class AddressHelp extends HelperBase {


    public AddressHelp(WebDriver wd) {

        super(wd);
    }

    public void fillcontact(GroupContact groupContsct) {
        type(By.name("firstname"),groupContsct.getName());
        type(By.name("lastname"),groupContsct.getLastname());
        type(By.name("address"),groupContsct.getAddress());
        type(By.name("home"),groupContsct.getTel());
        type(By.name("email"),groupContsct.getEmail());

    }

    public void returnToAddres() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void deliteAddress() {
        click(By.xpath("//div[@id='content']/form[2]/input[2]"));
    }

    public void creationsAddress() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }
}
