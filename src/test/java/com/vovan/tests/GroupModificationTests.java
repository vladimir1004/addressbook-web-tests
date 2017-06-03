package com.vovan.tests;


import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();

    if (!app.getGroopHelper().isThereAGroup()) {
      app.getGroopHelper().createGroupe(new GroupData("test1", null, null));
    }
    List<GroupData> before = app.getGroopHelper().getGroupList();
    app.getGroopHelper().selectGroups(before.size() -1);
    app.getGroopHelper().initGroupModification();
    app.getGroopHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroopHelper().submitGroupModification();
    app.getGroopHelper().returnToGroupPage();
    List<GroupData> after = app.getGroopHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

  }
}
