package com.OpK.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UI 
{
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beftest()
	{
		driver.get("https://localhost/opencart/upload/index.php?route=common/home&language=en-gb");
	}
	
	@Test
	public void checklogo()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title = 'Your Store']"));
		logo.isDisplayed();
		Assert.assertEquals(logo.isDisplayed(), true);
		
	}
	
	@AfterTest
	public void aftrTest()
	{
		driver.close();
	}
}
