package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\gilla\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/web/");
	WebElement textuser = driver.findElement(By.id("email"));
	textuser.sendKeys("12345");
	WebElement textpass = driver.findElement(By.name("pass"));
	
	
	textpass.sendKeys("654321");
	WebElement textlogin = driver.findElement(By.id("loginbutton"));
	textlogin.click();
	
	
}
}
