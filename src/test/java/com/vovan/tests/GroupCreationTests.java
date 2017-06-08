package com.vovan.tests;

import com.vovan.model.GroupData;
import com.vovan.model.Groups;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {
    app.goTo().groupPage();
    Groups before = app.group().all();
    GroupData group = new GroupData().withName("test2");
    app.group().create(group);
    Groups after = app.group().all();
    assertThat(after.size(), equalTo (before.size() + 1));
    assertThat(after, equalTo(
            before.withAdded( group.withId(after.stream().mapToInt((g)-> g.getId()).max().getAsInt()))));
  }


}

