package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karty Raja\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		//for (int i = 0; i < tRow.size(); i++) {
		for (int i = 2; i <=3 ; i++) {
			
			WebElement each=tRow.get(i);
				
			
		List<WebElement> tData = each.findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				WebElement each1 = tData.get(j);
				System.out.println(each1.getText());
				}
					
				}
				
			}
			
}
		
		
		
	
	
	

