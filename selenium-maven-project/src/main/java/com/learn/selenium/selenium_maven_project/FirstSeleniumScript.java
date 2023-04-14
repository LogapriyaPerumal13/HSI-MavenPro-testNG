package com.learn.selenium.selenium_maven_project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Desktop\\HSI_Study\\Selenium Software\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("Mobiles");
		driver.findElement(By.id("gh-btn")).click();
		
		/*driver.get("https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys("logapriya135@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("1234");	
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("HeadPhones");
		driver.findElement(By.id("gh-btn")).click();
		
		driver.get("https://www.ebay.com/");
//		driver.findElement(By.xpath("//input[@placeholder='your email address']")).sendKeys("logapriya135@gmail.com");*/
				
	}

}
