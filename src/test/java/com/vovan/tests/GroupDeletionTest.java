package com.vovan.tests;


import com.vovan.model.GroupData;
import com.vovan.model.Groups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupDeletionTest extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();

    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }


  @Test
  public void testGroupDeletion() throws Exception {

    Groups before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Groups after = app.group().all();
    assertEquals(after.size(), before.size() - 1);
    assertThat(after, equalTo(before.without(deletedGroup))
    );


  }


}










