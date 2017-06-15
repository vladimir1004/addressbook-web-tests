package com.vovan.model;


import java.io.File;

public class ContactData {
  private  String firstname;

  private String group;
  private String homePhone;
  private String mobilePhone;
  private String workPhone;
  private int id;
  private String lastname;
  private File photo;

  public int getId() {
    return id;
  }

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public ContactData withHomePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }
  public ContactData withMobilePhone (String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  public String getWorkPhone() {
    return workPhone;
  }
  public ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

  public ContactData() {
    this.firstname = firstname;
    this.lastname = lastname;
    this.group = group;
  }

  public ContactData withFirstName(String firstname) {
    this.firstname = firstname;
    return this;
  }

  public String getFirstname() {
    return firstname;
  }



  public String getLastname() {
    return lastname;
  }
  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }
  public String getGroup() {
    return group;
  }



}


