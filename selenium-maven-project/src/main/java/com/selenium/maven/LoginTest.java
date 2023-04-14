package com.selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Desktop\\HSI_Study\\Selenium Software\\New\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
	}

	@Test
	public void logintest()
	{
		try {
			driver.findElement(By.id("identifierId")).sendKeys("priyatestfortest@gmail.com");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Priyatestfortest@HSI13");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				//span[@class='VfPpkd-vQzf8d']")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	@AfterTest
	public void closeBrowser() 
	{
		driver.findElement(By.xpath("//img[@class='gb_h gbii']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sign out')]")).click();
		driver.close();
	}
		

}
