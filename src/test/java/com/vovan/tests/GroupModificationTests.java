package com.vovan.tests;


import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroopHelper().getGroupCount();
    if (!app.getGroopHelper().isThereAGroup()) {
      app.getGroopHelper().createGroupe(new GroupData("test1", null, null));
    }

    app.getGroopHelper().selectGroups();
    app.getGroopHelper().initGroupModification();
    app.getGroopHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroopHelper().submitGroupModification();
    app.getGroopHelper().returnToGroupPage();
    int after = app.getGroopHelper().getGroupCount();
    Assert.assertEquals(after, before);

  }
}
