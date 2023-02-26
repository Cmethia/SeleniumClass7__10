package com.Automation.code.AUTOMATION;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle_Alerts {
public static WebDriver driver;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");;
driver.findElement(By.name("proceed")).click();
Alert alt=driver.switchTo().alert();
String text=alt.getText();
//System.out.println("Text of the alert is:" +text );
if (text.equals("Please enter a valid user name")) {
	
alt.accept();
}else {
	alt.dismiss();
}
driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
driver.findElement(By.id("password")).sendKeys("Selenium@123");


	}

}
