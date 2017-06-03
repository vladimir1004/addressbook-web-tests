package com.vovan.tests;


import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if(!app.getGroopHelper().isThereAGroup()){
      app.getGroopHelper().createGroupe(new GroupData("test1", null, null));
    }
    List<GroupData> before = app.getGroopHelper().getGroupList();
    app.getGroopHelper().selectGroups(before.size() -1);
    app.getGroopHelper().deleteSelectedGroups();
    app.getGroopHelper().returnToGroupPage();
    List<GroupData> after = app.getGroopHelper().getGroupList();
    Assert.assertEquals(after, before.size() -1);

  }

}










