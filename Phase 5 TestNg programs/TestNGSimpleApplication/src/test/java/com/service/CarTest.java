package com.service;

import org.testng.annotations.Test;

public class CarTest {
	 @Test(groups= {"speed"})
	  public void speed() {
		  System.out.println("Car speed testing");
	  }
	  @Test(groups= {"mileage","speed"})
	  public void mileage() {
		  System.out.println("Car mileage testing");
	  }
	  @Test
	  public void color() {
		  System.out.println("Car color testing");
	  }}
