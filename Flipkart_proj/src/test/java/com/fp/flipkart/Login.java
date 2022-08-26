package com.fp.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	By loc_ph_no = By.xpath("(//input[@class='_2IX_2- VJZDxU'])[1]");
	By loc_pwd = By.xpath("(//input[@type='password'])[1]");
	By logn_btn = By.xpath("(//button[@type = 'submit'])[2]");
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Username()
	{
		driver.findElement(loc_ph_no).sendKeys("8618042684");
	}
	
	public void password()
	{
		driver.findElement(loc_pwd).sendKeys("mahesh@2010");
	}
	
	public void login_btn()
	{
		driver.findElement(logn_btn).click();;
	}
	
	
}
