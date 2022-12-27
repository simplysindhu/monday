package com.selenium.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
//single frame	
		driver.switchTo().frame("SingleFrame");

		WebElement iframe = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		iframe.sendKeys("aji123");
		Thread.sleep(3000);

//multiple frame	
		WebElement multiple = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		multiple.click();

		driver.switchTo().frame(1);
		driver.switchTo().frame(0);

		WebElement iframe2 = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		iframe2.sendKeys("sino456");

		// get back to the main page
		driver.switchTo().defaultContent();
		

		WebElement practise = driver.findElement(By.xpath("//a[text()=\"Practice Site\"]"));
		practise.click();

	}

}
