package Automation_9thclassTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Enabled_operation {
	public static WebDriver driver;
	@Test(priority=2)
	public void tc1() {	

		System.out.println("this is my test case 1");
	}
	
	@Test(priority=1, invocationCount=5)//if i want to run this 5 times use 
	public void tc2() {	
		System.out.println("this is my test case 2");	
		
	}
	@Test(priority=3, enabled=false)//if i dont want this to execute use enable
	public void tc3() {	
		System.out.println("this is my test case 3");
	}
}
