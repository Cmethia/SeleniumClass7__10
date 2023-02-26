package com.Automation.code.AUTOMATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers_using_ifelse {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String browser1="Chrome";
String browser2="FireFox";
String browser3="Edge";
if (browser1.equals("Chrome")){ //if this is true it will consider this and not execute the otehr conditions 
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
}else if(browser2.equals("Firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
}else if (browser3.equals("edge")) {
	
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
driver.get("https://www.google.com/");

}else {
	System.out.println("None of the browsers are open");
}
	}

}
