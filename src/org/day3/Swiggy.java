package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signup.click();
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='mobile']"));
		phone.sendKeys("7845751512");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("BALAGURU");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("balaguru1992raji@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("7845751512");
		
		WebElement button = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		button.click();
		
		
}
}
