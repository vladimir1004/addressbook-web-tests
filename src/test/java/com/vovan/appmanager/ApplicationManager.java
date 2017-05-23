package com.vovan.appmanager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver driver;


  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroopHelper groopHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {
       if(Objects.equals(browser, BrowserType.FIREFOX)){
      driver = new FirefoxDriver();
    } else if(Objects.equals(browser, BrowserType.CHROME)){
    driver = new ChromeDriver();
    } else if(Objects.equals(browser, BrowserType.EDGE)){
      driver = new EdgeDriver();
    }

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
