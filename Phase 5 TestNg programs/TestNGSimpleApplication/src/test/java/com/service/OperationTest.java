package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OperationTest {

  @Test
  @Ignore                        //like @disable annotation in junit
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.add(10,20);
	  assertEquals(result, 30);
  }

  @Test
  public void subTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.sub(20, 10);
	  assertEquals(result, 10);
  }

  @Test
  public void mulTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.mul(20, 10);
	  assertEquals(result, 200);
  }

  @Test
  public void divTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.div(20, 10);
	  assertEquals(result, 0);
  }
}
