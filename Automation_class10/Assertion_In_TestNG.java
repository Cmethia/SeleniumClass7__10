package Automation_class10;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertion_In_TestNG {


//Assertion means validating something and there are two types 
	//Hard Assert and soft Assert(I preferably use the soft assert bcz 
	@Test
	public void program1(){
		int i=10;
		Assert.assertTrue("int i=10 is ok", i<11);
		System.out.println(10/3);
		System.out.println();
		Assert.assertTrue(true);
	}
	@Test
	public void program2(){
		System.out.println("HI");
	}
	}
