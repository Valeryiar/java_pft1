package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appManager.ApplicationManager;

public class TestBase {

<<<<<<< HEAD
    protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);
=======
    protected final ApplicationManager app = new ApplicationManager();
>>>>>>> parent of a39937e... 30 тесты в разных браузерах

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
