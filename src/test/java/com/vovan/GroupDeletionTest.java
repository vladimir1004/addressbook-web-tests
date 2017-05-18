package com.vovan;


import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
   goToGroupPage();
    selectGroups();
    deleteSelectedGroups();
   returnToGroupPage();
  }

}










