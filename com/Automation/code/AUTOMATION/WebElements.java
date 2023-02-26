package com.Automation.code.AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click() ;                // here you are trying to find the element 
		driver.findElement(By.id("login1")).sendKeys("c@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("1234");
		Thread.sleep(6000);
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		

	}

}
