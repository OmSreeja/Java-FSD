package com.service;

import org.testng.annotations.Test;

public class BikeTest {
  @Test(groups= {"speed"})
  public void speed() {
	  System.out.println("Bike speed testing");
  }
  @Test(groups= {"mileage"})
  public void mileage() {
	  System.out.println("Bike mileage testing");
  }
  @Test
  public void color() {
	  System.out.println("Bike color testing");
  }
}
