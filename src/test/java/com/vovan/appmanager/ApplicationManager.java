package com.vovan.appmanager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver driver;


  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroopHelper groopHelper;

  public void init() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/");
    groopHelper = new GroopHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);

    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    driver.quit();
  }


  public GroopHelper getGroopHelper() {
    return groopHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
