package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver =new ChromeDriver();
//	public static void main (String[]args) {
	SoftAssert softAssertion= new SoftAssert();
//	}
	@Test
	public void demo() throws InterruptedException {
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(4000);

	    String actual = driver.getTitle();
	    String exp = "ajio";

	    softAssertion.assertEquals(actual, exp);

	    WebElement search = driver.findElement(By.name("q"));
	    softAssertion.assertTrue(search.isDisplayed());

	    System.out.println("Search bar is displayed");
	    System.out.println("hello");

	    softAssertion.assertAll();   // Must be the last statement
	}
	
}
