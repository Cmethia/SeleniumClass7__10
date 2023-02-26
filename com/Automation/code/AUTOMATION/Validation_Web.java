package com.Automation.code.AUTOMATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Web {
public static WebDriver driver;
	public static void main(String[] args) {
		//this will open your browser in incognit browser
		ChromeOptions options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);//i want to slow down selenium by using none
		options.addArguments("--incognit");//incognit does not save any cookies it always open fresh
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement Forgotp=driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		System.out.println(Forgotp.isDisplayed());
		System.out.println(Forgotp.isSelected());//will not work until is a radio button or a checkbox
		if(Forgotp.isDisplayed()==true) {
			Forgotp.click();
			System.out.println("The title of the page: " +driver.getTitle()+"...."+ "The current url of the page is: " +driver.getCurrentUrl());
		}else {
			System.out.println("The link is not clickable");
		}
	    //driver.quit();
		

	}

}
