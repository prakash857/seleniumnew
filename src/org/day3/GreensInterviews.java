package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensInterviews {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.greenstech.in/selenium-course-content.html");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			
			
			WebElement interviewque = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
			interviewque.click();
			
			WebElement resume1 = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
			resume1.click();
}
}