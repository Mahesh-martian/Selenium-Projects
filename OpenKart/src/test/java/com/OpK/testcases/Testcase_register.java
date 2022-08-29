package com.OpK.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OpK.smoketesting.RegistrationPage;

public class Testcase_register 
{
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void beforetest()
	{
		
		driver.manage().window().maximize();
		driver.get("https://localhost/opencart/upload/index.php?route=common/home&language=en-gb");

		
	}
	@Test(priority = 0 , enabled = false)
	public void completeregister()
	{
		RegistrationPage page = new RegistrationPage(driver);
		page.Registor();
				
	}
	
	@Test
	public void TS_001()
	{
		RegistrationPage page = new RegistrationPage(driver);
		
		page.MyAccount.click();
		
		page.Register.click();
		
		page.firstName.sendKeys("Sandesh");
				
		page.lastname.sendKeys("kumar");
		
		page.pwd.sendKeys("maheshumar20109");		
		
		page.pwd.sendKeys(Keys.ENTER);
		
	}
	
	public void TS_002()
	{
		RegistrationPage page = new RegistrationPage(driver);
		
		page.MyAccount.click();
		
		page.Register.click();
		
		page.firstName.sendKeys("Sandesh");
				
		page.lastname.sendKeys("kumar");
		
		page.pwd.sendKeys("maheshumar20109");		
		
		page.pwd.sendKeys(Keys.ENTER);
		
	}

	
	@AfterTest
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
