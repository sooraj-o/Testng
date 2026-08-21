package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test(priority=1,description="Valid credentials")
	public void logintest() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		WebElement un=driver.findElement(By.id("user-name"));
		un.sendKeys("standard_user");
		WebElement p=driver.findElement(By.id("password"));
		p.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test(priority=2,description="Invalid credentials")
	public void login() throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		WebElement un=driver.findElement(By.id("user-name"));
		un.sendKeys("standard_user");
		WebElement p=driver.findElement(By.id("password"));
		p.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}

	

}
