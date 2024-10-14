package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabTest {
	
	@Test
	public void swagLabTest() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    
    driver.findElement(By.id("login-button")).click();
	
	String actulTitle = "Swag Labs";
	
	String expectedTitle = driver.getTitle();
	
	Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@Test
	public void swagLabTest1() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	    driver.findElement(By.id("login-button")).click();
		
		String actulURL = "https://www.saucedemo.com/inventory.html";
		
		String expectedURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actulURL, expectedURL);
	}
}
