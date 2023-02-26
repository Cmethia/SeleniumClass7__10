package Automation_9thclassTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayAROUND {
	public static WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test//first test case
	public void setUP() {	
		driver.get("https://www.ebay.com/");	
	}
	@Test//second test case
	public void MyEbayButton() {
		driver.findElement(By.linkText("My eBay")).click();
	}

	
}
