package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by alena on 03.10.16.
 */
public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        login("admin", "secret");

    }

    private void login(String username, String password) {
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

    protected void returnGroupPaga() {
        wd.findElement(By.linkText("group page")).click();
    }

    protected void sumbitGroupCreation() {
        wd.findElement(By.cssSelector("div.msgbox")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
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

    protected void initGroupCreation() {
        wd.findElement(By.name("group_name")).click();
    }

    protected void gotoGroupPage() {
        wd.findElement(By.name("new")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    protected void delitaSelectGroup() {
        wd.findElement(By.name("delete")).click();
    }

    protected void SelectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    protected void gotoGroupPages() {
        wd.findElement(By.linkText("groups")).click();
    }

    protected void fillcontact(GroupContact groupContsct) {
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

    protected void returnToAddres() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    protected void gotoAdders() {
        wd.findElement(By.linkText("add new")).click();
    }

    protected void deliteAddress() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }

    protected void creationsAddress() {
        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
    }

    protected void gotoAddressBook() {
        wd.get("http://localhost/addressbook/index.php");
    }
}
