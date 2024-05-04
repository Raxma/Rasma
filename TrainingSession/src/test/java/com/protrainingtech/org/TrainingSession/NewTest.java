package com.protrainingtech.org.TrainingSession;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite Annotation");
  }
  @Test
  public void testsecond()
  {
	  System.out.println("This is second test annotation");
  }

}
