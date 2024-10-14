package com.springboot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YoutubeSong {
	
	@Test
	public void song() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("khairiyat puchho song");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		List <WebElement> music = driver.findElements(By.xpath("//img[@class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'][@src='https://i.ytimg.com/vi/81mNMDzgLLA/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB1NNN30ycswQ7u7IePIeyGjSyPjQ']"));
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("video-title")).click();
	}
}
