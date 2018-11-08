package ru.stqa.pft.addressbook.model;

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



    public ContactData(  String firstname, String lastname, String allPhones) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.allPhones=allPhones;
        this.id=id;
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
        this.homePhone=mobilePhone;
        return this;
    }

    public ContactData withHomePhone (String homePhone) {
        this.homePhone=homePhone;
        return this;
    }


    public ContactData withId(int id) {
        this.id=id;
        return this;
    }
}
