package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alena on 29.11.16.
 */
public class SessionsHelper extends HelperBase {



    public SessionsHelper(FirefoxDriver wd) {
        super(wd);
    }

    protected void login(String username, String password) {
        wd.get("http://localhost/addressbook/group.php");
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
