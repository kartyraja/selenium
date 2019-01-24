package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.lang.model.util.Elements;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class BaseClass {
	WebDriver driver;
	Set<String> st = driver.getWindowHandles();
	
	public WebDriver chrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		}
	public WebDriver fireFox() {
		
		System.setProperty("webdriver.getko.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
		}
	public WebDriver ie() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	return driver;
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public void type(WebElement element,String name) {
		element.sendKeys(name);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void getTitle() {
		driver.getTitle();
	}
	
	public void sleep(int time) throws InterruptedException {
		Thread.sleep(time);

	}
	
	public void draganddrop(WebElement s,WebElement d) {
	Actions acc=new Actions(driver);
	acc.dragAndDrop(s, d).perform();

	}
	public void screenShot() throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File s=tk.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\screen\\img.png");
		FileUtils.copyFile(s,d);
	}
	
	public void selectTheText(WebElement sel) {
		Actions acc=new Actions(driver);
acc.doubleClick(sel).perform();
	}
	
	//alerts
	
	public void accpet() {
	 Alert alt = driver.switchTo().alert();
	 alt.accept();
	}
	
	private void alertY() {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Yes");
		alt.accept();

	}
	private void alertN() {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("NO");
		alt.accept();

	}
	 public void dismiss() {
		 Alert alt = driver.switchTo().alert();
		 alt.dismiss();

	}
		public void copyTheText() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
		
		}
		
		public void pasteTheText() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		
		}
		
		public void mouseOver(WebElement ele) {
			Actions acc=new Actions(driver);
			acc.moveToElement(ele).perform();
			// TODO Auto-generated method stub

		}
		
		public void jstype(WebElement element,String name) {
		
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value',name)",element);
		}
		
		public void jstype(WebElement element) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",element);
		}
		
		//Windows Handling
		public void childWindow() {
			
			Iterator<String> it = st.iterator();
			String parent = it.next();
			String child = it.next();
			driver.switchTo().window(child);

		}
		
		public void defaultWindow() {
			driver.switchTo().defaultContent();

		}
		
		public void parentWindow() {
			
			Iterator<String> it = st.iterator();
			String parent = it.next();
			driver.switchTo().window(parent);
		}
		
		public void windowMax() {
driver.manage().window().maximize();

		}
		
		public void quit() {
			driver.quit();

		}
		public void close() {
			driver.close();

		}
	}

	
	
	

