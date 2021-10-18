package org.automation.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Login02Test {
  @Test
  public void f() {
	  System.out.println("Test - LoginTest02");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before test - LoginTest02");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after test - LoginTest02");
	  
  }

}
