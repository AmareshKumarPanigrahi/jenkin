package com.Test;

import java.time.Duration;
import java.util.List;

import javax.management.ConstructorParameters;

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

import utility.BaseClass;



public class FlipkartFetchingProductAndPriceTest extends BaseClass{
	
	@Test
public void main() {
		
	/**
	 * open flipkart
	 */
	driver.get("https://www.flipkart.com/");
	/**
	 * close the login Windowpopup
	 */
	//driver.findElement(By.xpath("//button[text()='✕']")).click();
	/**
	 * search for iphone
	 */
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
	/**
	 * store all search results product names
	 */
	List<WebElement> phNames=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	/**
	 * iterate over the price 
	 */
	for(WebElement phname:phNames) {
		String name=phname.getText();
		String price=driver.findElement(By.xpath("//div[text()='"+name+"']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(name+"---->"+price);
	}
}
}
