package com.selenium.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Desktop\\HSI_Study\\Selenium Software\\New\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
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
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	}
	
	@Test
	public void logintestinvalid()
	{
			try {
				driver.findElement(By.id("identifierId")).sendKeys("priyatestfortest1@gmail.com");
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				Thread.sleep(3000);
				/*driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Priyatestfortest@HSI13");
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				Thread.sleep(3000);*/
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	}
}