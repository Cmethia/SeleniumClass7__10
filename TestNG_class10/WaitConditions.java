package TestNG_class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConditions {
public static WebDriver driver;
WebDriverWait wait;
SoftAssert softassert= new SoftAssert();//soft assert require to create an object reference in order to interact
@BeforeTest
public void openURL() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));//if the page doesnt load within 10 second fail that 
	//if it loads move ahead
}
@Test
public void clickOnSignIN() {
	WebElement signlink=driver.findElement(By.className("signin"));
    softassert.assertTrue(signlink.isEnabled());
	//explicit wait 
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
	wait.until(ExpectedConditions.elementToBeClickable(signlink)).click();
	softassert.assertAll();
}
public void loginCredential(){
	WebElement usernameTextBox=driver.findElement(By.id("login1"));
	WebElement passwordTextBox=driver.findElement(By.id("password"));
	WebElement loginButton=driver.findElement(By.name("proceed"));
	
	softassert.assertTrue(usernameTextBox.isEnabled());
	softassert.assertTrue( passwordTextBox.isEnabled());
	softassert.assertTrue( loginButton.isDisplayed());
	wait=new WebDriverWait(driver, Duration.ofSeconds(4));
	wait.until(ExpectedConditions.elementToBeClickable(usernameTextBox)).sendKeys("seleniumpanda@rediffmail.com");
	wait=new WebDriverWait(driver, Duration.ofSeconds(4));
	wait.until(ExpectedConditions.elementToBeClickable(passwordTextBox)).sendKeys("Selenium@123");
	wait=new WebDriverWait(driver, Duration.ofSeconds(4));
	wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	softassert.assertAll();
}
@Test
public void logOut() {
	//WebElement logOutLink=driver.findElement(By.id("login1"));
}
@Test
public void rediffHome() {
	//WebElement rediffHomelink=driver.findElement(By.id("login1"));
}
}
