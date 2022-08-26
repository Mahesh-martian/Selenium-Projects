package com.fp.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product_search 
{
	By product = By.xpath("//a[contains(text(),'APSARA Absolute Extra Strong Extra Dark 20 Pencil Penci...')]");
	
	WebDriver driver;
	
	
	public product_search(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void Select_product()
	{
		driver.findElement(product).click();
		
	}
	
}
