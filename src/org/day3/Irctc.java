package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("Goa");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		button.click();
}
}
