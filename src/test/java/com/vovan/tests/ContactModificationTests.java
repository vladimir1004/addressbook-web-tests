package com.vovan.tests;


import com.vovan.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

@Test(enabled = false)
  public void testsContactModification (){
  app.goTo().goTOHomePage();
  app.contact().initContactModification();
  app.contact().fillContactFrom(new ContactData(),false);
  app.contact().submitContactModification();
  app.contact().returnToHomePage();

  }
}
