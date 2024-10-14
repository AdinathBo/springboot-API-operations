package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldPositive {

	@Test
	public void testcaseHelloWorld() {

		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8082/get/v1");

		String actualValue = "HelloWorld";

		WebElement element = driver.findElement(By.tagName("body"));

		String expectedValue = element.getText();

		Assert.assertEquals(actualValue, expectedValue);
	}
}
