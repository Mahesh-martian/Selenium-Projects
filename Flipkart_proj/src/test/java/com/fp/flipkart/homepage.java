package com.fp.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage 
{
	WebDriver driver;
	By search = By.xpath("//input[@title = 'Search for products, brands and more']");
	String Productcategory = "pencil";
	
	homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void search()
	{
		WebElement se = driver.findElement(search);
		se.sendKeys(Productcategory);
		se.sendKeys(Keys.ENTER);
	}
	
	
	
	

}
