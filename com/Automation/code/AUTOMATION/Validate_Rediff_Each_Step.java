package com.Automation.code.AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_Rediff_Each_Step {
public static WebDriver driver;
	public static void main(String[] args)  {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	//url validation
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String currentU="https://www.rediff.com/";
	String expectedU=driver.getCurrentUrl();
	String currentT="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	String expectedT=driver.getTitle();
	if(currentU.equals(expectedU)&& currentT.equals(expectedT)) {
		System.out.println("my url is correct");
	}else {
		System.out.println("My url is not correct");
		
	}
WebElement signlink=driver.findElement(By.className("signin"));
if(signlink.isEnabled()==true && signlink.isDisplayed()==true) {
	signlink.click();
}else {
	System.out.println("the link is not working ");
}
WebElement usernamebox=driver.findElement(By.id("login1"));
if(usernamebox.isEnabled()==true && usernamebox.isDisplayed()==true) {
usernamebox.sendKeys("seleniumpanda@rediffmail.com");
	}else {
		System.out.println("the username search box is not enabled or displayed ");
	}
WebElement passw=driver.findElement(By.name("passwd"));
if(passw.isEnabled()==true && passw.isDisplayed()==true) {
	passw.sendKeys("Selenium@123");
}else {
	System.out.println("the password textbox field is not enabled or displayed");
}

WebElement signinB=driver.findElement(By.name("proceed"))	;
if(signinB.isEnabled()==true && signinB.isDisplayed()==true) {
signinB.click();
}else {
	System.out.println("the sign in button is not disabled");
}
WebElement logout=driver.findElement(By.className("rd_logout"));
if(logout.isEnabled()==true && logout.isDisplayed()==true) {
	logout.click();
}else {
	System.out.println("the logout link is not working");
}
WebElement successfulSignout=driver.findElement(By.xpath("//p[text()='You have successfully signed out of Rediffmail.']"));
if (successfulSignout.isDisplayed()==true) {
	System.out.println("successful sign out");
}else {
	System.out.println("Not a success");
}
WebElement RediffHomepage=driver.findElement(By.xpath("//b[text()='Rediff Home']"));
if (RediffHomepage.isEnabled()==true && RediffHomepage.isDisplayed()==true) {
	RediffHomepage.click();
	
}else {
	System.out.println("The homepage link is not enabled or displayed");
	
}
}
}
