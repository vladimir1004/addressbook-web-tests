package com.vovan.tests;


import com.vovan.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

@Test(enabled = false)
  public void testsContactModification (){
  app.goTo().goTOHomePage();
  app.getContactHelper().initContactModification();
  app.getContactHelper().fillContactFrom(new ContactData("test_name", "test_surname",null),false);
  app.getContactHelper().submitContactModification();
  app.getContactHelper().returnToHomePage();

  }
}
