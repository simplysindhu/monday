package com.selenium.in;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_up {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\ZZCucumber\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement close = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		close.click();
		WebElement camera = driver.findElement(By.xpath("//img[@alt=\"Top Mirrorless Cameras (Shop Now!)\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", camera);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\screenshots\\JSSHOT.png");
		FileUtils.copyFile(source, dest);
		System.out.println("captured");

	}

}
