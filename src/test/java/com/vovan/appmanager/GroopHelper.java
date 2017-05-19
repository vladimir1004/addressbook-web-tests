package com.vovan.appmanager;

import com.vovan.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GroopHelper {
  private WebDriver driver;

  public GroopHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  public void deleteSelectedGroups() {
    driver.findElement(By.name("delete")).click();
  }

  public void selectGroups() {
    driver.findElement(By.name("selected[]")).click();
  }
}
