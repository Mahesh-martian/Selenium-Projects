package com.fp.flipkart;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RootClass 
{
	String url = "https://www.flipkart.com/";
	
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void Btest()
	{
		
		driver.get(url);
	}
	
	
	@Test
	public void Test1() throws InterruptedException
	{
		
		
		
		Login login = new Login(driver);
		
		login.Username();
		login.password();
		login.login_btn();
		
		homepage home = new homepage(driver);
		
		home.search();
		
		driver.navigate().refresh();
		
		product_search prod_search = new  product_search(driver);
		
		prod_search.Select_product();
		
		Set<String> P_cAddress = driver.getWindowHandles(); 
		ArrayList<String> a = new ArrayList<String>(P_cAddress);
		driver.switchTo().window(a.get(1));
		
		Product_detail product_details = new Product_detail(driver);
		
/*		product_details.buyNow();
		
		orderPage order = new orderPage(driver);
		
		order.Address();
		order.address_contbtn();
		order.sel_COD();
		//After selecting COD please Enter the characters in the CAPTCHA within 10 seconds
		Thread.sleep(10000);
		order.confirn_order();
		
		cancel_order cancelOrder = new cancel_order(driver);
		
		driver.manage().timeouts().implicitlyWait(5, null);
		cancelOrder.popup_deny();
		cancelOrder.cancel_Btn();
		cancelOrder.confirm_cancel();
		cancelOrder.selectCancelReason();
		cancelOrder.typeReason();
		driver.manage().timeouts().implicitlyWait(5, null);
		cancelOrder.reasonCont();
		driver.manage().timeouts().implicitlyWait(5, null);
		cancelOrder.requestcancellation();
		
		Thread.sleep(10000);*/
		
	}

	@AfterTest
	public void atest()
	{
		driver.quit();
	}
}
