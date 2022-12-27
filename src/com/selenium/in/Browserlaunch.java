package com.selenium.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\driver\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https //www.instagram login.com/ hl=en");	
	WebElement findElement = driver.findElement(By.name("username"));	
	findElement.sendKeys("royally");	
		
	WebElement findElement2 = driver.findElement(By.name("password"));	
	findElement2.sendKeys("doggy@65");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
