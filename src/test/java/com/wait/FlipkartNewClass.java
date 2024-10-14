package com.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartNewClass {

	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
	}
	
	@Test
	public void testWithoutImplicitWait() {
		
		driver.get("https://www.flipkart.com/");
		
		String actualURL = "https://www.flipkart.com/";
		
		String expectedURL = driver.getCurrentUrl();
		
		if(actualURL.equals(expectedURL)) {
			Assert.fail("test case failed without using implicit wait");
		}
		
		Assert.assertTrue(actualURL.equals(expectedURL));
	}
	
	@AfterMethod
	public void testClose() {
		if(driver!=null);
		driver.quit();
	}
}
