package com.Automation.code.AUTOMATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class training {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();// webderver manager is a binary file which interacts with your browser
												// and it doesnt
//care if your if your browser is 109 today and 110 next year, s it will automatically take cra eof everything
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

}
