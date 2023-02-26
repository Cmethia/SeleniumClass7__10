package Automation_class10;

import org.testng.annotations.Test;

public class Enabled_vs_AlwaysRun {
	@Test(priority=1, enabled=false, alwaysRun=true)//enabled=false is the most powerful annotation in testNG, if it iis there 
	//alwaysRun will not take the priority
	public void logic1() {
		System.out.println("First Logic");
		
	}
	@Test(priority=2, dependsOnMethods="logic1")
	public void logic2() {
		System.out.println("second Logic");
		
	}
	@Test(priority=3, dependsOnMethods={"logic1", "logic2"})
	public void logic3() {
		System.out.println("Third Logic");
		
	}

}
