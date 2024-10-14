package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DevisionNegative {
	
	@Test
	public void testcaseDivision() {

		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8082/get/v2");

		String actualValue = "10";

		WebElement element = driver.findElement(By.tagName("pre"));

		String expectedValue = element.getText();

		Assert.assertEquals(actualValue, expectedValue);
	}
}
