package com.Automation.code.AUTOMATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabANDWindow {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if you want to open any link in a new window 
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");;
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com/");
		openWindow();
		driver.quit();
	}
	public static void openWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.facebook.com/");
	}

}
