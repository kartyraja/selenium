package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day6 {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);	
	WebElement close = driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
	close.click();
	WebElement element = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	element.sendKeys("iphone");

	WebElement search = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	search.click();
	Thread.sleep(3000);
	WebElement iphone = driver.findElement(By.xpath("//img[@alt='Apple iPhone 6s (Space Grey, 32 GB)']"));
	iphone.click();
	
	Set<String> st = driver.getWindowHandles();
	Iterator<String> it = st.iterator();
	String parent =  it.next();
	String child =it.next();
	//swtich to parent
	driver.switchTo().window(child);
	///System.out.println("Returned to parent");
	Thread.sleep(1000);
	WebElement addCart = driver.findElement(By.xpath("//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]"));
	addCart.click();
	Thread.sleep(3000);
	WebElement amount = driver.findElement(By.xpath("//div[@class=\"_3xFQAD\"]"));
	String print = amount.getText();
	System.out.println(print);
	
	driver.switchTo().window(parent);
	}

}
