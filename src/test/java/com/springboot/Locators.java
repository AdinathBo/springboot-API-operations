package com.springboot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	
	@Test
	public void findLocator() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		//driver.findElement(By.partialLinkText("Backpack")).click();
		//Thread.sleep(2000);
		
		//List <WebElement> element = driver.findElements(By.partialLinkText("Sauce Labs"));
		//System.out.println("List of WebElement: "+element.size());
		
		//driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@id='item_4_img_link']")).click();
		
		driver.findElement(By.id("item_4_img_link")).click();
	}
}
