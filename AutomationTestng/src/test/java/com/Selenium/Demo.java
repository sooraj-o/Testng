package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		
		
	}
	@Test(priority=1,description="Valid credentials")
	public void login() throws InterruptedException {
	WebElement un=driver.findElement(By.id("user-name"));
	un.sendKeys("standard_user");
	WebElement p=driver.findElement(By.id("password"));
	p.sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=2,description="Valid credentials")
	public void logindemo() throws InterruptedException {
	WebElement un=driver.findElement(By.id("user-name"));
	un.sendKeys("standard_user");
	WebElement p=driver.findElement(By.id("password"));
	p.sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
}
