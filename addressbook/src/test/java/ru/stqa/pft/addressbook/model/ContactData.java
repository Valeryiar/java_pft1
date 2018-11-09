package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private  int id = Integer.MAX_VALUE;
    private  String firstname;
    private  String lastname;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String allPhones;

    public String getAllPhones() {
        return allPhones;
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }





    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public int getId() {
        return id;
    }


    public String getGroup() {
        return group;
    }
    public String getWorkPhone() {
        return workPhone;
    }

    public ContactData withWorkPhone(String workPhone) {
        this.workPhone=workPhone;
        return this;
    }

    public ContactData withMobilePhone (String mobilePhone) {
        this.mobilePhone=mobilePhone;
        return this;
    }

    public ContactData withHomePhone (String homePhone) {
        this.homePhone=homePhone;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(group, that.group) &&
                Objects.equals(homePhone, that.homePhone) &&
                Objects.equals(mobilePhone, that.mobilePhone) &&
                Objects.equals(workPhone, that.workPhone) &&
                Objects.equals(allPhones, that.allPhones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, group, homePhone, mobilePhone, workPhone, allPhones);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                '}';
    }

    public ContactData withId(int id) {
        this.id=id;
        return this;
    }

    public ContactData withFirstname(String firstname) {
        this.firstname=firstname;
        return this;
    }

    public ContactData withLastname(String lastname) {
        this.lastname=lastname;
        return  this;
    }
}
