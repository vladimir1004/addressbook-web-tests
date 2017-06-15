package com.vovan.tests;


import com.vovan.model.ContactData;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation(){
    app.goTo().goTOHomePage();
    app.contact().initContactCreation();
    File photo = new File("src/test/resources/stru.png");
    app.contact().fillContactFrom(new ContactData()
            .withFirstName("test name").withLastname("test surname").withPhoto(photo),true);
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();



  }
  @Test
  public  void testCurrentDir(){
    File currentDir = new File(".");
    System.out.println( currentDir.getAbsolutePath());
    File photo = new File("src/test/resources/20150828_110138.jpg");
    System.out.println( photo.getAbsolutePath());
    System.out.println(photo.exists());
  }

}
