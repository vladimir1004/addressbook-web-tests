package com.vovan.tests;


import com.vovan.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation(){
    app.getNavigationHelper().goTOHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactFrom(new ContactData("test_name", "test_surname", "test1"),true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();



  }

}
