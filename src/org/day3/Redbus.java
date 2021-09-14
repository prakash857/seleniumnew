package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			
			
			WebElement click = driver.findElement(By.xpath("//div[@id='hc']"));
			click.click();
			
		
}
}