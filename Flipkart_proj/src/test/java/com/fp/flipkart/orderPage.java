package com.fp.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orderPage 
{
	By address = By.xpath("//button[@class = '_2KpZ6l RLM7ES _3AWRsL']");
	By adress_cont = By.xpath("//button[text() = 'CONTINUE']");
	By COD = By.cssSelector("label[for='COD']");
	By Confirm_COD = By.xpath("//span[text() = 'Confirm Order']");
	
	WebDriver driver;
	
	public orderPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void Address()
	{
		driver.findElement(address).click();
	}
	
	void address_contbtn()
	{
		driver.findElement(adress_cont).click();
	}
	
	void sel_COD()
	{
		driver.findElement(COD).click();
	}
	
	void confirn_order()
	{
		driver.findElement(Confirm_COD).click();;
	}
	
	
}
