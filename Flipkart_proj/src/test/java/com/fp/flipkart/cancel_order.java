package com.fp.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class cancel_order
{
	By Notify_pop = By.cssSelector("button[class = 'N2KxHO']");
	By Cancel_btn = By.xpath("//span[text() = 'Cancel']");
	By Canc_confirm = By.xpath("//button[text() = 'Cancel Order']");
	By Cancel_reason = By.xpath("//select[@name = 'reasonList']");
	By textarea = By.xpath("//textarea");
	By reason_cont = By.xpath("//button[@class = '_2KpZ6l _3AWRsL']");
	By Request_canc = By.xpath("(//span[text() = 'Request Cancellation'])[2]");
	
	WebDriver driver;
	
	public cancel_order(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void popup_deny()
	{
		driver.findElement(Notify_pop).click();
	}
	
	void cancel_Btn()
	{
		driver.findElement(Cancel_btn);
	}
	
	void confirm_cancel()
	{
		driver.findElement(Canc_confirm);
	}
	
	
	void selectCancelReason()
	{
		WebElement selectOption = driver.findElement(Cancel_reason);
		Select Sel = new Select(selectOption);
		
		Sel.selectByVisibleText("Expected delivery time is very long");
	}
	
	void typeReason()
	{
		driver.findElement(textarea).sendKeys("Expected delivery time is very long");
	}
	
	void reasonCont()
	{
		driver.findElement(reason_cont).click();
	}
	
	void requestcancellation()
	{
		driver.findElement(Request_canc).click();
	}
	
}
