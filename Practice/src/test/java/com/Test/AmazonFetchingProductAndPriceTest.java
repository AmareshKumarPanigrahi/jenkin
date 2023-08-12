package com.Test;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AmazonFetchingProductAndPriceTest extends utility.BaseClass {

	@Test
	public void actions() {
	/**
	 * opening amazon application
	 */
	
	driver.get("https://www.amazon.in/");
	
	/**
	 * searching samsung phone
	 */
	
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung phone",Keys.ENTER);
	 
	/**
	 * x ptah for samsung phone product names
	 */
	 
	 List<WebElement> phnNames=driver.findElements(By.xpath("//span[contains(@class,'a-text-normal') and starts-with(text(),'Samsung Galaxy')]"));
	 
	 
	
	 
	 
	 for(WebElement phn:phnNames) {
		 
		String productname=phn.getText();
		 /**
		  * xpath for product prices
		  */
		try { 
		String productprice =driver.findElement(By.xpath("//span[text()='"+productname+"']/../../../../descendant::span[@class='a-price-whole']")).getText();
		System.out.println(productname+"------>"+productprice);
		System.out.println();
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
		
		
	 }
	 
	 
}
}
