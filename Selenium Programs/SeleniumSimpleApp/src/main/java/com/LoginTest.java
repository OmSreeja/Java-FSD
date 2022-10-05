package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\javafsd\\javademos\\Selenium Programs\\chromedriver_win32\\chromedriver.exe");
	      WebDriver wd=new ChromeDriver();
	      wd.get("http://127.0.0.1:5500/login.html");
	      /*String sourceCurrentPagePath=wd.getCurrentUrl();
	      System.out.println(sourceCurrentPagePath);
	      WebElement emailIdRef=wd.findElement(By.id("n1"));
	      WebElement passwordRef=wd.findElement(By.id("n2"));
	      emailIdRef.sendKeys("sree@gmail.com");
	      passwordRef.sendKeys("123");
	      WebElement submitButtonRef=wd.findElement(By.id("b1"));
	      submitButtonRef.click();
	      String targetCurrentPagePath=wd.getCurrentUrl();
	      System.out.println(targetCurrentPagePath);
	      WebElement h2TagRef=wd.findElement(By.tagName("h2"));
	      System.out.println(h2TagRef.getText());
	      //WebElement resetButtonRef=wd.findElement(By.id("b2"));
	      //resetButtonRef.click();*/
	      
	      /*WebElement emailIdRef=wd.findElement(By.id("n1"));
	      WebElement passwordRef=wd.findElement(By.id("n2"));
	      WebElement submitButtonRef=wd.findElement(By.id("b1"));
	      submitButtonRef.click();
	      Alert alertRef= wd.switchTo().alert();
	      System.out.println(alertRef.getText());
	      alertRef.accept();*/
	      WebElement emailIdRef=wd.findElement(By.id("n1"));
	      WebElement passwordRef=wd.findElement(By.id("n2"));
	      emailIdRef.sendKeys("sree@gmail.com");
	      passwordRef.sendKeys("123");
	      
	      
	      
	}

}
