package com.vovan.tests;

import com.vovan.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    app.getGroopHelper().initGroupCreation();
    app.getGroopHelper().fillGroupForm(new GroupData("test13", "test2", "test3"));
    app.getGroopHelper().submitGroupCreation();
    app.getGroopHelper().returnToGroupPage();
  }


}

