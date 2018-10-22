package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion (){
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact ( new ContactData("name", "last", "email", "test1"));
        }
        app.getContactHelper().selectContact();
        app.getNavigationHelper().deleteGroup();

    }
}
