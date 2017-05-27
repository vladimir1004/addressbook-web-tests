package com.vovan.tests;

import com.vovan.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    app.getGroopHelper().createGroupe(new GroupData("test1", null, null));

  }


}

