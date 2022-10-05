package com.testing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver wd;
 @BeforeMethod
 public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "C:\\javafsd\\javademos\\Selenium Programs\\chromedriver_win32\\chromedriver.exe");
     wd=new ChromeDriver();
 }

  @Test
  public void loginChaceking() {
      wd.get("http://127.0.0.1:5500/loginPageA.html");
      WebElement emailIdRef=wd.findElement(By.id("txt1"));
      WebElement passwordRef=wd.findElement(By.id("txt2"));
      emailIdRef.sendKeys("sree@gmail.com");
      passwordRef.sendKeys("123");
      WebElement submitButtonRef=wd.findElement(By.id("btn"));
      submitButtonRef.click();
      WebElement output=wd.findElement(By.id("out"));
      String result=output.getText();
      assertEquals(result,"Dta added");
      WebElement submitButtonRef1=wd.findElement(By.id("l1"));
      submitButtonRef1.click();
      WebElement emailIdRef1=wd.findElement(By.id("n1"));
      WebElement passwordRef1=wd.findElement(By.id("n2"));
      emailIdRef1.sendKeys("sree@gmail.com");
      passwordRef1.sendKeys("123");
      WebElement submitButtonRef2=wd.findElement(By.id("btn1"));
      submitButtonRef2.click();
      Alert alertRef= wd.switchTo().alert();
      String result1=alertRef.getText();
      alertRef.accept();
      assertEquals(result1, "success");
      WebElement submitButtonRef3=wd.findElement(By.id("j1"));
      submitButtonRef3.click();

  }
}
