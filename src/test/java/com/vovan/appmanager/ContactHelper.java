package com.vovan.appmanager;

import com.vovan.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }
  public void initContactCreation(){
    click(By.linkText("add new"));
  }

  public void fillContactFrom(ContactData contactData, boolean creation){
type(By.name("firstname"), contactData.getFirstname());
type(By.name("lastname"), contactData.getLastname());

if (creation){
  new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
}
else {
  Assert.assertFalse(isElementPresent(By.name("new_group")));
}
}

  public void submitContactCreation(){
    click(By.name("submit"));
  }
  public void returnToHomePage(){
    click(By.linkText("home page"));
  }
  public void initContactModification(){
    click(By.cssSelector("img[alt='Edit']"));
  }
public void submitContactModification(){
    click(By.name("update"));
}
}
