package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day4test {
	

		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.homedepot.com/");
			
			WebElement close = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
			Actions acc1=new Actions(driver);
			acc1.moveToElement(close).perform();
					WebElement mouse1 = driver.findElement(By.xpath("//a[text()='Paint'][1]"));
			//Actions acc1=new Actions(driver);
			acc1.moveToElement(mouse1).perform();
			//Thread.sleep(1000);
			WebElement mouse2 = driver.findElement(By.xpath("//a[text()='Interior Paint'][2]"));
			//Actions acc1=new Actions(driver);
			acc1.moveToElement(mouse2).perform();
			WebElement mouse3 = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
			mouse3.click();	
			//Thread.sleep(1000);
			/*WebElement close1 = driver.findElement(By.xpath("//button[@type='button'][1]"));
			close1.click();
			
			/*WebElement par = driver.findElement(By.xpath("(//div/child::p)[4]"));
			String text = par.getText();
			System.out.println(text);	*/	
			
			
			
			
			/*WebElement mouse2 = driver.findElement(By.xpath("//span[text()='Mobiles, Computers'])"));
			acc1.moveToElement(mouse2).perform();
			WebElement clickBtn= driver.findElement(By.xpath("//span[text()='Power Banks']"));
			clickBtn.click();*/
			
		}

	}



