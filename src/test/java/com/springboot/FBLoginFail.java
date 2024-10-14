package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBLoginFail {

	@Test
	public void testcaseFBLogin() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("aborude432@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("adinath@13");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		String actualURL = "https://www.facebook.com/";
		String expectedURL = driver.getCurrentUrl();

		Assert.assertEquals(actualURL, expectedURL);
	}
}
