package com.vovan.tests;


import com.vovan.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroopHelper().selectGroups();
    app.getGroopHelper().initGroupModification();
    app.getGroopHelper().fillGroupForm(new GroupData("test1", "test2", null));
    app.getGroopHelper().submitGroupModification();
    app.getGroopHelper().returnToGroupPage();
  }
}
