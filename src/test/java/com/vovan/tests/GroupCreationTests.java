package com.vovan.tests;

import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroopHelper().getGroupList();
    app.getGroopHelper().createGroupe(new GroupData("test1", null, null));
    List<GroupData> after = app.getGroopHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

  }


}

