package ru.stqa.pft.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactData {
    public static String getGroup;
    private final String firstname;
    private final String lastname;
    private final String email;
    private String group;

    public ContactData(String firstname, String lastname, String email, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.group = group;
        
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }
}
