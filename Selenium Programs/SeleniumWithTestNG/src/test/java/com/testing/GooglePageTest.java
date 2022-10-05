package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GooglePageTest {
	WebDriver wd;
  @Test
  public void f() {
	  wd.get("https://www.google.com");
	  wd.manage().window().maximize();
	 wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  WebElement textfieldRef=wd.findElement(By.name("q"));
	  textfieldRef.sendKeys("what is testing");
	  WebElement buttonRef=wd.findElement(By.name("btnK"));
	  //buttonRef.click();
	  buttonRef.sendKeys(Keys.ENTER);
	  try {
		  Thread.sleep(5000);
	  }catch(Exception e) {}
	  wd.navigate().back();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\javafsd\\javademos\\Selenium Programs\\chromedriver_win32\\chromedriver.exe");
	     wd=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
