package TestNG_class10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_In_Asserts {
	public static WebDriver  driver ;
	@Test
	public void logic1(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
        Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
        driver.findElement(By.className("signin")).click();
        String currentTitle=driver.getTitle();
        String currentURL=driver.getCurrentUrl();
        System.out.println(driver.getTitle());//Rediffmail
        System.out.println(driver.getCurrentUrl());//https://mail.rediff.com/cgi-bin/login.cgi
        //after running it works which means the assertion is passing 
        Assert.assertEquals(currentURL,"https://mail.rediff.com/cgi-bin/login.cgi");
        Assert.assertEquals(currentTitle,"Rediffmail" );
        driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
       WebElement password=driver.findElement(By.id("password"));
       Assert.assertTrue(password.isEnabled());
       password.sendKeys("Selenium@123");
	}
}
