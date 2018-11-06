package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private  ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper ;


    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        contactHelper=new ContactHelper(wd);
       navigationHelper = new NavigationHelper(wd);
       sessionHelper = new SessionHelper(wd);
       groupHelper = new GroupHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper group() {
        return groupHelper;
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
