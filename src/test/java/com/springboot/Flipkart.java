package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public void flipkartTest() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	String actualTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	String expectedTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
    element.sendKeys("wallet");  
    
    WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
    searchButton.click();
    
    //WebElement image = driver.findElement(By.xpath("//div[@data-id='WCWFEQH7KBUHPNJA']"));
    //image.click();    
    
    driver.quit();
}
}