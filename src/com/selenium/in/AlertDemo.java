package com.selenium.in;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement simple = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		simple.click();
		Alert salert = driver.switchTo().alert();
		salert.accept();

		WebElement confirm = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		confirm.click();
		WebElement conalert = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		conalert.click();
		Alert calert = driver.switchTo().alert();
		calert.dismiss();

		WebElement prompt = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]"));
		prompt.click();
		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		promptalert.click();
		Alert proalert = driver.switchTo().alert();
		proalert.sendKeys("ajith");
		proalert.dismiss();

	}

}
