package TestNG_class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  parameterization {
	//browser
	//username/
	//passsword all this three can act as a parameters
	public static WebDriver driver;
  String Browser="Chrome";
	@Test(priority =1 )
	@Parameters({"Browser", "url"})
	public void openURL(String Browser , String url) {
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}else if(Browser.equals("Firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	}
		driver.get(url);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}
	@Test(priority =2)
	public void clickOnSignIN() {
		WebElement signlink=driver.findElement(By.className("signin"));
		signlink.click();
}
	@Test(priority = 3)
	@Parameters({"username", "password"})
	public void LoginCredential(String username, String password) {
		WebElement usernameTextBox=driver.findElement(By.id("login1"));
		usernameTextBox.sendKeys(username);
		WebElement passwordTextBox=driver.findElement(By.id("password"));
		passwordTextBox.sendKeys(password);
		WebElement loginButton=driver.findElement(By.name("proceed"));
		loginButton.click();
}
	}