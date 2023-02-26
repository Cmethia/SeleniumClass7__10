package com.Automation.code.AUTOMATION;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
public static WebDriver driver;
	public static void main(String[] args) {
		//16locators in selenium
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://mail.rediff.com");
		/*List<WebElement> allTags= driver.findElements(By.tagName("div"));
		System.out.println(allTags.size());
		WebElement searchbox=driver.findElement(By.id("login1"));
		System.out.println(searchbox.getTagName());*/
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Sign "));
		

	}

}
