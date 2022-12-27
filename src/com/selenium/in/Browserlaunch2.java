package com.selenium.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserlaunch2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.facebook.com/");

		WebElement create = driver.findElement(By.xpath("//a[contains(@class,\"_4jy6 _4jy2 selected _51sy\")]"));
		create.click();

		Thread.sleep(5000);

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("sweety");

		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("hearty");

		WebElement findElement = driver.findElement(By.name("reg_email__"));
		findElement.sendKeys("manisindhu0123@gmail.com");

		WebElement findElement1 = driver.findElement(By.name("reg_email_confirmation__"));
		findElement1.sendKeys("manisindhu0123@gmail.com");

		WebElement findElement2 = driver.findElement(By.name("reg_passwd__"));
		findElement2.sendKeys("doggyrosy");

		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s = new Select(date);
		s.selectByIndex(23);

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByValue("5");

		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2001");

		WebElement radio = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		radio.click();

		Thread.sleep(5000);

		WebElement signup = driver.findElement(By.xpath("(//*[@type=\"submit\"])[2]"));
		signup.click();
		Thread.sleep(3000);

	}

}
