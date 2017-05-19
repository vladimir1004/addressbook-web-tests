package com.vovan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigationHelper {
 private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void goToGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }
}
