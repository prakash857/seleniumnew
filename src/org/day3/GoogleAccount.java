package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("BALAGURU");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("R");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='Username']"));
		username.sendKeys("seleniumguruomr");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		password.sendKeys("1Balaguru@123");
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		confirm.sendKeys("1Balaguru@123");
		
		WebElement showpassword = driver.findElement(By.xpath("//input[@id='i3']"));
		showpassword.click();
		
		WebElement button = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		button.click();
		Thread.sleep(3000);
		WebElement phone = driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
		phone.sendKeys("7845751512");
		
		
		
		
		
		
		
		
	}
}
