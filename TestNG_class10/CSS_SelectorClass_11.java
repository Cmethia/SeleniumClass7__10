package TestNG_class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_SelectorClass_11 {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void LaunchURL() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	@Test
	public void signinLink() throws InterruptedException {
		driver.findElement(By.cssSelector("a.moneyicon.relative")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class=signin")).click();
		
	}
	@Test
	public void loginCredential() {
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("hgg");
	}
	
	@AfterTest
	public void tearDown() {
	}
}