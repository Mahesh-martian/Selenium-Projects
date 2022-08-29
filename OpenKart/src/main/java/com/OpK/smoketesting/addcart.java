package com.OpK.smoketesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcart 
{
	WebDriver driver;
	
	public addcart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//img)[1]")
	public WebElement logo;
	
	@FindBy(xpath = "//a[text() = 'MacBook']")
	public WebElement prod;
	
	@FindBy(id = "button-cart")
	public WebElement cartbtn;
	
	@FindBy(xpath = "//a[@title = 'Shopping Cart']")
	public WebElement shopcart;
	
	
	public void Click(WebElement ele)
	{
		ele.click();
		
	}
	
	
}
