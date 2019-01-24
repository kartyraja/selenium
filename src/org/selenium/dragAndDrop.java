package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icaionlineregistration.org/Fac_Reg.aspx");
		
	WebElement firstText = driver.findElement(By.id("ddlPOU"));
	Select S=new Select(firstText);
	S.selectByVisibleText("CHENNAI");
	WebElement SecText = driver.findElement(By.id("ddlSalutation"));
	Select S1=new Select(SecText);
	S1.selectByVisibleText("Mr");
	WebElement textFirst = driver.findElement(By.id("txt_name"));
	textFirst.sendKeys("Karty");
	WebElement textSec = driver.findElement(By.id("txt_lastname"));
	textSec.sendKeys("Raja");
	WebElement gender = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
	gender.click();
	WebElement textadd = driver.findElement(By.id("Txt_add"));
	textadd.sendKeys("123 Street, Chennai");
	WebElement state = driver.findElement(By.id("ddl_state"));
	Select st=new Select(state);
	st.selectByVisibleText("Kerala");
	Thread.sleep(500);
	WebElement city = driver.findElement(By.id("ddl_City"));
	Select ct=new Select(city);
	ct.selectByVisibleText("CALICUT");
	WebElement eMail = driver.findElement(By.id("txt_mail"));
	eMail.sendKeys("Karty@123.com");
	WebElement phNo = driver.findElement(By.id("txt_mbl"));
	phNo.sendKeys("1234567");
	WebElement pin = driver.findElement(By.id("txt_pin"));
	pin.sendKeys("631209");
	WebElement uName = driver.findElement(By.id("txt_uname"));
	uName.sendKeys("kartyraja");
	WebElement pass1 = driver.findElement(By.id("txt_pswd"));
	pass1.sendKeys("karty1990");
	WebElement pass2 = driver.findElement(By.id("txt_Repswd"));
	pass2.sendKeys("karty1990");
	
		
	}
}
