package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver", "C:\\javafsd\\javademos\\Selenium Programs\\chromedriver_win32\\chromedriver.exe");
      WebDriver wd=new ChromeDriver();
      wd.get("http://127.0.0.1:5500/index.html ");  //load static or dynamic web page
      /*String titleTg=wd.getTitle();
      String url=wd.getCurrentUrl();
      String pageContent=wd.getPageSource();
      System.out.println(url);
      System.out.println(titleTg);
      System.out.println(pageContent);*/
      WebElement h2TagRef=wd.findElement(By.tagName("h2"));
      WebElement pTagRef=wd.findElement(By.tagName("p"));
      WebElement divTagRef=wd.findElement(By.tagName("div"));
      System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
      System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
      System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
      List<WebElement> listOfPTag=wd.findElements(By.tagName("p"));
      Iterator<WebElement> ii=listOfPTag.iterator();
      while(ii.hasNext()) {
    	  WebElement ww=ii.next();
    	  System.out.println(ww.getTagName()+" "+ww.getText());
      }
      WebElement divTagid=wd.findElement(By.id("id1"));
      System.out.println(divTagid.getTagName()+" "+divTagid.getText());
      wd.close();
      
	}

}
