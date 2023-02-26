package com.Automation.code.AUTOMATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static WebDriver driver;
public static Select select;
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[text()='Create new account']")).click();
driver.findElement(By.name("firstname")).sendKeys("Selenium");
driver.findElement(By.name("lastname")).sendKeys("celia");
driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("1233");
//select class drop down 
//you have to create the object of select class 
select= new Select(driver.findElement(By.id("month")));
//select.selectByindex-- do not use this 
//selct.selectByvalue -- do not use this 
select.selectByVisibleText("May");

select=new Select(driver.findElement(By.id("day")));
select.selectByVisibleText("20");

select=new Select(driver.findElement(By.id("year")));
select.selectByVisibleText("2000");

WebElement toggle= driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
toggle.click();

}
}