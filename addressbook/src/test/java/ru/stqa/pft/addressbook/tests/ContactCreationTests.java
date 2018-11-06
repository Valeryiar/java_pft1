package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        app.goTo().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("name", "last", "email", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);
    }

}
