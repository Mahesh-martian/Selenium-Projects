package com.OpK.smoketesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RegistrationPage	
{
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}


	
	@FindBy(xpath = "(//span[@class = 'd-none d-md-inline'])[3]")
	public WebElement MyAccount;
		
	@FindBy(partialLinkText = "Register")
	public WebElement Register;
	
	@FindBy(id = "input-firstname")
	public WebElement firstName;
	
	@FindBy(id = "input-lastname")
	public WebElement lastname;
	
	@FindBy(id = "input-email")
	public WebElement email;
	
	@FindBy(id = "input-password")
	public WebElement pwd;
	
	@FindBy(xpath = "//input[@name = 'agree']")
	public WebElement agre;
	
	

	public void Registor()
	{
		
		
		MyAccount.click();
		
		Register.click();
		
		firstName.sendKeys("Sandesh");
				
		lastname.sendKeys("kumar");
		
		email.sendKeys("testmail@gmail.com");
		
		pwd.sendKeys("maheshumar20109");
				
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", agre);
		
		pwd.sendKeys(Keys.ENTER);
		
	}
	


}
