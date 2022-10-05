package com.service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HookTestingMethods {
  @Test
 // @Ignore
  public void f2() {
	  System.out.println("while testing 2nd method-first class");
  }
  @Test
  // @Ignore
   public void f1() {
 	  System.out.println("while testing 1st method-first class");
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

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
