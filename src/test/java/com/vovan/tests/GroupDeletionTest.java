package com.vovan.tests;


import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroopHelper().selectGroups();
    app.getGroopHelper().deleteSelectedGroups();
    app.getGroopHelper().returnToGroupPage();
  }

}










