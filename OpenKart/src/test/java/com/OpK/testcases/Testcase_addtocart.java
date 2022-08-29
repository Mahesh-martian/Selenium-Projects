package com.OpK.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OpK.smoketesting.addcart;

public class Testcase_addtocart 
{
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void beforetest()
	{
		
		driver.manage().window().maximize();
		driver.get("https://localhost/opencart/upload/index.php?route=common/home&language=en-gb");		
	}
	
	@Test
	public void test_001()
	{
		addcart addcrt = new addcart(driver);
		addcrt.Click(addcrt.logo);
		addcrt.Click(addcrt.prod);
		addcrt.Click(addcrt.cartbtn);
		addcrt.Click(addcrt.shopcart);
		
	}
	
	@AfterTest
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
	

}

