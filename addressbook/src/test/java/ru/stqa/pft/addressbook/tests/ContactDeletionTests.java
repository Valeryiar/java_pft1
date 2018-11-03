package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion (){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact ( new ContactData("name", "last", "email", "test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();

        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);

    }
}
