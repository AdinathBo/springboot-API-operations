package com.springboot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleMap {
	
	@Test
	public void testGoogleMap() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@18.497536,73.924608,14z?entry=ttu&g_ep=EgoyMDI0MDkyNC4wIKXMDSoASAFQAw%3D%3D");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//span[@class='SxXeRb EI48Lc']"));
		
		
		
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='SxXeRb EI48Lc']"));
		
		System.out.println("length : "+element.size());
		
//		<span class="SxXeRb EI48Lc" aria-hidden="true">Menu</span>
		
		WebElement e1 = element.get(0);
		
		WebElement e2 = element.get(1);
		
//		WebElement e3 = element.get(2);
		
		System.out.println("e1 : "+e1.getCssValue("span"));
		System.out.println("e2 : "+e2.getTagName());
//		System.out.println("e3 : "+e3.getText());
			
	}
}
