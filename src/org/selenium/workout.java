package org.selenium;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class workout {

	static WebDriver driver;
	@BeforeClass
	
	public static void lauchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(currentUrl);
		System.out.println(title);
	}
	
	@AfterClass
	public static void quitbrowser() {
		//driver.quit();

	}
	
	@Test
	public void testbox() throws InterruptedException {
	Thread.sleep(1000);
	WebElement s = driver.findElement(By.xpath("//button[text()='×'][1]"));
	s.click();
	WebElement d = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(d).perform();
		
	
	}
	
}
