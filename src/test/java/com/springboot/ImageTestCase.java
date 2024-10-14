package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTestCase {

	@Test
	public void findLocator() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//a[@id='item_4_img_link']")).click();

		String actualImageSrc = driver.findElement(By.xpath("//img[@class='inventory_details_img']"))
				.getAttribute("src");

		String expectedImageSrc = "https://www.saucedemo.com/inventory-item.html?id=4";

		Assert.assertEquals(actualImageSrc, expectedImageSrc);
	}
}
