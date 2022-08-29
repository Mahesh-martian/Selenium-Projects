package com.OpK.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpK.smoketesting.loginPage;

public class TestcaseLogin 
{
	WebDriver driver;
	@BeforeMethod
	public void beforetest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost/opencart/upload/index.php?route=common/home&language=en-gb");
//		Thread.sleep(30000);
	}
	
	@Test(priority = 1)
	public void test_001()
	{
		loginPage login = new loginPage(driver);
		login.Login();
		Assert.assertEquals(login.warng.isDisplayed(), false);

	}
	
	@Test(priority = 0)
	public void test_002()
	{
		loginPage login1 = new loginPage(driver);
		login1.MyAccount.click();
		login1.login.click();
		login1.email.sendKeys("testmail@gmail.com");
		login1.pwd.sendKeys("biriyani");

		
		Assert.assertEquals(login1.warng.isDisplayed(), true);
	}
	
	@AfterMethod
	public void closebrowser() throws InterruptedException 
	{
		driver.close();
	}
}
