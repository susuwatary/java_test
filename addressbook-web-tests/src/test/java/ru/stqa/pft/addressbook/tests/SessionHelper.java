package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

/**
 * Created by alena on 04.10.16.
 */
public class SessionHelper  extends HelperBase{

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }
    public void login(String username, String password) {
        wd.get("http://localhost/addressbook/group.php");
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
