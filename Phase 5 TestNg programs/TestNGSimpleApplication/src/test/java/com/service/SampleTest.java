package com.service;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void f1() {
	  System.out.println("second class");
  }
  @Test
  public void f2() {
	  System.out.println("second class");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Methods");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Methods");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
	 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }
  
}
