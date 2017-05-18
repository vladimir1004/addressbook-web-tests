package com.vovan;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }


}

