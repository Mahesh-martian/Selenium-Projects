package com.OpK.smoketesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//span[@class = 'd-none d-md-inline'])[3]")
	public WebElement MyAccount;
	
	@FindBy(partialLinkText = "Login")
	public WebElement login;
	
	@FindBy(id = "input-email")
	public WebElement email;
	
	@FindBy(id = "input-password")
	public WebElement pwd;
	
	@FindBy(xpath = "//button[text() = 'Login']")
	public WebElement cont;
	
	@FindBy(xpath = "//i[@class = 'fas fa-exclamation-circle']")
	public WebElement warng;
	

	public void Login()
	{
//		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\selenium\\OpenKart\\src\\main\\resources\\com\\data1.properties");
//		Properties p = new Properties(); 
//		p.load(fis);
		
		MyAccount.click();
		
		login.click();
		
		email.sendKeys("testmail@gmail.com");
		
		pwd.sendKeys("maheshumar20109");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
//		jse1.executeScript("arguments[0].click()", cont);
		cont.click();
		
	}
	
}
