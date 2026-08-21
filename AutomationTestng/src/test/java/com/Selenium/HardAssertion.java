package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	WebDriver driver =new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		String actual=driver.getTitle();
		String exp="ajio";
		Assert.assertNotEquals(actual, exp);
//		WebElement search=driver.findElement(By.name("q"));
//		Assert.assertTrue(search.isDisplayed());
//		System.out.println("Search bar is displayed");
		
		WebElement s=driver.findElement(By.name("q"));
		Assert.assertTrue(s.isDisplayed());
		System.out.println("Search bar is displayed");
		String cookievalue=driver.manage().getCookieNamed(exp)==null?null:driver.manage().getCookieNamed(exp).getValue();
		Assert.assertNull(cookievalue);
	}
	

}
