package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        app.goTo().goToHomePage();
        Contacts before =  app.contact().all();
        ContactData contact=new ContactData().withFirstname("first");
        app.contact().create(contact);
        Contacts after =  app.contact().all();
        assertThat(app.contact().count(), equalTo(before.size()+1));
        assertThat(after, equalTo(
                before.withAdded(contact.withId(after.stream().mapToInt((g)->g.getId()).max().getAsInt()))));

    }

}
