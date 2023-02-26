package com.Automation.code.AUTOMATION;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");;
		System.out.println(System.getProperty("user.dir"));
		WebElement weatherScreen= driver.findElement(By.cssSelector("div.section.where-to"));
		//particular method that help us in selenium to take screenshots
		
		File source=weatherScreen.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Celia Methia\\eclipse-work\\AUTOMATION\\Screenshots\\Screenshot1.png");
		FileHandler.copy(source, destination);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.shaadi.com/");
		WebElement shaadiScreen=driver.findElement(By.id("homepage_banner"));
		File source1=shaadiScreen.getScreenshotAs(OutputType.FILE);
		File destination1=new File(System.getProperty("user.dir")+ " \\AUTOMATION\\Screenshots\\Screenshot2.png");
		FileHandler.copy(source1, destination1);
		
	}

}
