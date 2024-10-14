package com.springboot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBloginTestCase {
	
	@Test
	public void testcaseFBLogin() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("aborude432@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("adinath@123");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		String actualURL= "https://www.facebook.com/";
		String expectedURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
		//driver.findElement(By.linkText("https://scontent.fpnq5-1.fna.fbcdn.net/v/t39.30808-1/316267509_928049801505798_856193555032019655_n.jpg?stp=cp0_dst-jpg_s40x40&_nc_cat=108&ccb=1-7&_nc_sid=6738e8&_nc_ohc=R4TLeK22amcQ7kNvgEbWmdo&_nc_ht=scontent.fpnq5-1.fna&_nc_gid=A1n8W5h3y31zf1A4iErqu6A&oh=00_AYDdyG_eNTe37Dpu2yIWo1-VDvfwJMqtemd3NwktEIEoOw&oe=66F8C39F")).click();
	}
}
