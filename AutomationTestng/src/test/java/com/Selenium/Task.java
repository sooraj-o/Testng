package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setup() {
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");
    }

    @Test
    public void Title() throws InterruptedException {
    	 String actualTitle = driver.getTitle();
         System.out.println("title is " + actualTitle);
         SoftAssert softAssertion = new SoftAssert();
         String expectedTitle = "Online Shopping Site for Women, Men, Kids Fashion, Lifestyle & More.";
         softAssertion.assertEquals(actualTitle, expectedTitle);
         softAssertion.assertAll();
    }
         @Test(priority = 2)
         public void SignInTitle() throws InterruptedException {
             SoftAssert softAssertion = new SoftAssert();
             driver.findElement(By.xpath("//span[@aria-label='Sign in or join AJIO']")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("//input[@aria-label='Mobile Number']")).sendKeys("8129029134");
             driver.findElement(By.xpath("//button[@type='submit']")).click();
             Thread.sleep(9000);
             String secondTitle = driver.getTitle();
             System.out.println("Second title is " + secondTitle);
             String expTitle ="Online Shopping for Women, Men, Kids Fashion, Lifestyle & More - AJIO";
             softAssertion.assertEquals(secondTitle, expTitle);
         
             softAssertion.assertAll();
         }
         @Test(priority = 3)
         public void CustomerTitle() throws InterruptedException {
             SoftAssert softAssertion = new SoftAssert();
             driver.findElement(By.xpath("//a[@href='/selfcare']")).click();
             Thread.sleep(7000);
             String thirdTitle = driver.getTitle();
             System.out.println("Thrid title is " + thirdTitle);
             String expTitle ="Online Shopping for Women, Men, Kids Fashion, Lifestyle & More - AJIO";
             softAssertion.assertEquals(thirdTitle, expTitle);   
             driver.navigate().back();
             softAssertion.assertAll();
         }
    @AfterMethod
    public void last() {
//        driver.quit();
    }
}