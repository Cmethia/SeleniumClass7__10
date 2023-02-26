package Automation_class10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert_Concept {
	SoftAssert softassert;
	@Test
	public void logic1() {
		softassert=new SoftAssert();//in softassert the control will come and the test case will also pass
		
		//even though the assertion is failing
	boolean b1=1<2;
	softassert.assertTrue(b1);//true
	boolean b2=1>2;
	softassert.assertTrue(b2);//false
	System.out.println("hello");
	softassert.assertAll();//this is accumulation of all assertion 
	String s1="hello";
	String s2="by";
	softassert.assertEquals(s1, s2);
	System.out.println("I am printing something");
	}
	@Test
	public void logic2() {
	}
	}
