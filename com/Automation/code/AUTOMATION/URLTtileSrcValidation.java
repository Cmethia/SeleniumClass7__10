package com.Automation.code.AUTOMATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLTtileSrcValidation {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.rediff.com/");
		//to validate if the title of the website correct or not 
		//System.out.println(driver.getTitle());
		/* String actualTitle="Rediff.com: News | 1Rediffmail | Stock Quotes | Shopping";
	        String expectedTitle=driver.getTitle();
	        if (actualTitle.equals(expectedTitle)) {
	        	driver.get("https://www.rediff.com/");
	        }else {
	        	driver.get("https://www.google.com/");   
        }	
	/*String actualURL="https://www.rediff.com/";
		String expectedURL=driver.getCurrentUrl();
		
		if (actualURL.equals(expectedURL)) {
		driver.get("https://www.rediff.com/");
		}else {
			driver.get("https://www.google.com");
		}
		*/
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
String actualURL="https://mail.rediff.com/cgi-bin/login.cgi";
String expectedURL=driver.getCurrentUrl();
String actualTi="Rediffmail";
String expecTi=driver.getTitle();
if (actualURL.equals(expectedURL)&& actualTi.equals(expecTi)) {
driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("124@hhh.com"); //if everything is correct then enter the username
}else {
	System.out.println("my url is not correct");
}
}
}