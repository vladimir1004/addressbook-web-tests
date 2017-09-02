package com.vovan.tests;


import com.vovan.model.ContactData;
import com.vovan.model.Groups;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation(){
    Groups groups = app.db().groups();
    File photo = new File("src/test/resources/20150828_110138.jpg");
    ContactData newContact = new ContactData().withFirstName("test_name").withLastname("test_surname").withPhoto(photo)
            .inGroup(groups.iterator().next());
    app.goTo().goTOHomePage();
    app.contact().initContactCreation();
    app.contact().fillContactFrom(newContact,true);
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();



  }
  @Test
  public  void testCurrentDir(){

    // . is current directory
    File currentDir = new File(".");
    // exit absolutePath
    System.out.println( currentDir.getAbsolutePath());
    //File photo = new File("src/test/resources/stru.png");
   File photo = new File("src/test/resources/20150828_110138.jpg");
    System.out.println( photo.getAbsolutePath());
    System.out.println(photo.exists());
  }

}
