package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicday2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement click = driver.findElement(By.id("DUMMY1"));
		click.click();
		
		WebElement username = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		username.sendKeys("12345");
		
		
		WebElement password = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		password.sendKeys("7845751512");
		
}
}
