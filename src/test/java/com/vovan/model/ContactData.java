package com.vovan.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
@Entity
@Table(name = "addressbook")
public class ContactData {
@Id
@Column (name = "id")
  private int id;

@Column (name = "firstname")
  private  String firstname;

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }

  @Column (name = "lastname")
  private String lastname;

  @Transient
  private String group;

  @Column (name = "home")
  @Type(type = "text")
  private String homePhone;

  @Column (name = "mobile")
  @Type(type = "text")
  private String mobilePhone;

  @Column (name = "work")
  @Type(type = "text")
  private String workPhone;

  @Transient
  private String allPhones;

  @Column (name = "photo")
  @Type(type = "text")
  private String photo;

  public File getPhoto() { return new File(photo); }

  public ContactData withPhoto(File photo) {
    this.photo = photo.getPath();
    return this;
  }
  public String getAllPhones() { return allPhones; }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }





  public int getId() {
    return id;
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


