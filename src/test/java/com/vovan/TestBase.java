package com.vovan;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  private WebDriver driver;

  @BeforeClass
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    driver.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
  }

  protected void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  protected void goToGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();

  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected void deleteSelectedGroups() {
    driver.findElement(By.name("delete")).click();
  }

  protected void selectGroups() {
    driver.findElement(By.name("selected[]")).click();
  }
}
