package com.selenium.in;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_demo {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement best = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_bestsellers\"]"));

		Actions ac = new Actions(driver);
		ac.contextClick(best).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronics = driver.findElement(By.xpath("//*[text()=\" Electronics \"]"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(electronics).build().perform();

		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		WebElement books = driver.findElement(By.xpath("//a[text()=\"Books\"]"));
		Actions ac2 = new Actions(driver);
		ac2.contextClick(books).build().perform();

		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);

		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String mypage = "books:Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		for (String i : allId) {
			if (driver.switchTo().window(i).getTitle().equals(mypage)) {
				break;
			}
		}

		driver.quit();

	}

}
