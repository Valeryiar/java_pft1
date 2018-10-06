package ru.stqa.pft.addressbook.appManager;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
=======
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
>>>>>>> parent of b6d73c1... создаем тест без рекордера
=======
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
>>>>>>> parent of b6d73c1... создаем тест без рекордера
=======
>>>>>>> parent of a39937e... 30 тесты в разных браузерах
=======
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
>>>>>>> parent of b6d73c1... создаем тест без рекордера
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;



    public void init() {
       wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }




    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
