package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.GroupContsct;

/**
 * Created by alena on 04.10.16.
 */
public class AdderessHelper extends HelperBase {

    public AdderessHelper(WebDriver wd) {
        super(wd);
    }

    public void fillcontact(GroupContsct groupContsct) {
        type(By.name("firstname"),groupContsct.getName());
        type(By.name("lastname"),groupContsct.getLastname());
        type(By.name("address"),groupContsct.getAddress());
        type(By.name("home"),groupContsct.getTel());
        type(By.name("email"),groupContsct.getEmail());
    }

    public void returnToAddres() {

        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
}
