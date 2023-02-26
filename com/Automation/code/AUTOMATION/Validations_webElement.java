package com.Automation.code.AUTOMATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_webElement {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement usernametextbox=driver.findElement(By.id("login1"));
		//validation for a particular webelemt: we use isDisplayed, isEnabled, isSelected
		System.out.println(usernametextbox.isDisplayed());
		System.out.println(usernametextbox.isEnabled());
		System.out.println(usernametextbox.isSelected());
		if(usernametextbox.isDisplayed()&& usernametextbox.isEnabled()) {
		usernametextbox.sendKeys("hjhjh@");
		}else {
			System.out.println("username textbox is not working");
		}
	}

}
