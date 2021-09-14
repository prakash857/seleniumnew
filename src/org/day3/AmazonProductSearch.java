package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		WebElement searchproduct = driver.findElement(By.xpath("(//img[@class='landscape-image'])[1]"));
		searchproduct.click();
		
		WebElement searchproduct2 = driver.findElement(By.xpath("(//img[@class='a-dynamic-image sl-sobe-carousel-sub-card-img'])[1]"));
		searchproduct2.click();
}
}
