package com.vovan.tests;


import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroopHelper().getGroupCount();
    if(!app.getGroopHelper().isThereAGroup()){
      app.getGroopHelper().createGroupe(new GroupData("test1", null, null));
    }
    app.getGroopHelper().selectGroups();
    app.getGroopHelper().deleteSelectedGroups();
    app.getGroopHelper().returnToGroupPage();
    int after = app.getGroopHelper().getGroupCount();
    Assert.assertEquals(after, before -1);

  }

}










