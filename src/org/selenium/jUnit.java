package org.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jUnit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//assertTrue(driver.getTitle().contains("or"));

	}
	
	@AfterClass
	public static void afterClass() {
		//driver.quit();
	}
	
	@Test
	public void signIn() throws InterruptedException {
		WebElement signIn = driver.findElement(By.id("sign-in-icon-down"));
		signIn.click();
		WebElement signIn2 = driver.findElement(By.id("signInLink"));
	signIn2.click();
	Thread.sleep(2000);
	
	driver.switchTo().frame(1);
	WebElement email = driver.findElement(By.xpath("//div[@class=\"signin-screen\"]"));
	email.click();
			
	}
	@Test
	public void signIn2() {
		
		WebElement email = driver.findElement(By.id("email-mobile"));
		email.sendKeys("karty");
		assertEquals("karty",email.getAttribute("value"));
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345");
		assertEquals("123",pass.getAttribute("value"));
	}
	
	@Before
	public void beforeMethod() {
		

	}
	
	@After
	public void afterMethod() {
		
	}
	
	
	
}
