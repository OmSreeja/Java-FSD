package com;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEmployee {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\javafsd\\javademos\\Selenium Programs\\chromedriver_win32\\chromedriver.exe");
	      WebDriver wd=new ChromeDriver();
	      wd.get("http://127.0.0.1:5500/loginPageA.html");
	      WebElement emailIdRef=wd.findElement(By.id("txt1"));
	      WebElement passwordRef=wd.findElement(By.id("txt2"));
	      emailIdRef.sendKeys("sree@gmail.com");
	      passwordRef.sendKeys("123");
	      WebElement submitButtonRef=wd.findElement(By.id("btn"));
	      submitButtonRef.click();
	      WebElement output=wd.findElement(By.id("out"));
	      String result=output.getText();
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
	      }

}
