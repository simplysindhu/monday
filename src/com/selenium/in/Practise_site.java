package com.selenium.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_site {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"S:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\practicing space\\Selenium_PRACTICE\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//*[@class=\"login\"]"));
		signin.click();
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("rosyglassy@gmail.com");
		WebElement create = driver.findElement(By.name("SubmitCreate"));
		create.click();
		Thread.sleep(4000);
		WebElement radio = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		radio.click();
		WebElement firstname = driver.findElement(By.name("customer_firstname"));
		firstname.sendKeys("kaja");
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("raja");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("kr@678");
		WebElement date = driver.findElement(By.id("days"));
		Select s = new Select(date);
		s.selectByIndex(2);
		WebElement month = driver.findElement(By.name("months"));
		Select s1 = new Select(month);
		s1.selectByValue("3");
		WebElement year = driver.findElement(By.xpath("(//*[@class=\"form-control\"])[3]"));
		Select s2 = new Select(year);
		s2.selectByValue("2019");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
		checkbox.click();
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.xpath("//*[text()=\"Your address\"]"));
		address.click();
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("mannaran company");
		WebElement address1 = driver.findElement(By.name("address1"));
		address1.sendKeys("h street,56789,mannarz");
		WebElement address2 = driver.findElement(By.name("address2"));
		address2.sendKeys("florida apt");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chicago");
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.id("id_state"));
		Select s4 = new Select(state);
		s4.selectByValue("1");
		WebElement postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("98765");
		WebElement country = driver.findElement(By.name("id_country"));
		Select s3 = new Select(country);
		s3.selectByValue("21");
		Thread.sleep(2000);
		WebElement additionalinfo = driver.findElement(By.name("other"));
		additionalinfo.sendKeys("null");
		WebElement mobileno = driver.findElement(By.id("phone_mobile"));
		mobileno.sendKeys("9393939393");
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		register.click();

	}

}
