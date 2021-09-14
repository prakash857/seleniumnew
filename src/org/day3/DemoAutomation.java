package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("BALAGURU");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("R");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("56, Mariamman Koil Street, Veemacoundampalayam, Puducherry-605009");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("balaguru1992r@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9944157962");
		
		WebElement btngender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		btngender.click();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		checkbox2.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys("1Balaguru@123");
		
		WebElement confirmpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmpass.sendKeys("1Balaguru@123");
		
	
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	}
}
