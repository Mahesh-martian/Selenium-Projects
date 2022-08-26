package com.fp.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_detail 
{
	By buy_btn = By.xpath("//button[text() = 'BUY NOW']");
	
	WebDriver driver;
	
	public Product_detail(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	void buyNow()
	{
		driver.findElement(buy_btn).click();
	}
	
}
