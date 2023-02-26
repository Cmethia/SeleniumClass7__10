package com.Automation.code.AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classPractice {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.rediff.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[@class='mailicon']")).click();
driver.findElement(By.xpath("//a[text()='Rediffmail']")).click();
driver.findElement(By.xpath("//a[contains(text(), 'Rediffmail')]")).click();
driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	}

}
