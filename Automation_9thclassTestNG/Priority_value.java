package Automation_9thclassTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Priority_value {
	public static WebDriver driver;
	@Test(priority=2)
	public void tc1() {	

		System.out.println("this is my test case 1");
	}
	
	@Test(priority=1)
	public void tc2() {	
		System.out.println("this is my test case 2");	
		
	}
	@Test(priority=3)
	public void tc3() {	
		System.out.println("this is my test case 3");
	}
}
