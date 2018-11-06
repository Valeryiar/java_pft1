package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void groupPage() {

                  click(By.linkText("groups"));
    }

    public void goToHomePage() {
        click(By.linkText("home"));
    }

    public void deleteGroup() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input")); click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }
}
