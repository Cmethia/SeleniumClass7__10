package Automation_9thclassTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution_Priorities  {
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Testing Before suite annotation");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Testing Before test annotation");
}
  
@BeforeClass
public void beforeClass() {
	System.out.println("Testing Before class annotation");
  
}
@Test
public void testCase1() {
	System.out.println("My code is wrking fine ");
}
@AfterSuite
public void afterSuite() {
	  System.out.println("Testing after suite annotation");
}
@AfterTest
public void afterTest() {
	  System.out.println("Testing after test annotation");
}

@AfterClass
public void afterClass() {
	System.out.println("Testing after class annotation");
}
}