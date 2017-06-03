package com.vovan.tests;

import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroopHelper().getGroupList();
    GroupData group = new GroupData("test2", null, null);
    app.getGroopHelper().createGroupe(group);
    List<GroupData> after = app.getGroopHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

//вычисление максимального идентификатора
    group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }


}

