package com.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.BaseClass;



public class AutoSuggestionsTest extends BaseClass{
	
	@Test
public  void main() throws InterruptedException {
	
	/**
	 * get amazon
	 */
	
	driver.get("https://www.amazon.in/");
	
	/**
	 * search for earphones
	 */
	
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphones");
	 Thread.sleep(2000);
	 //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visi(By.xpath("//div[@aria-label='earphones wired']/ancestor::div[@class='left-pane-results-container']//span")));
	 
	 /**
	  * capture autoSugesstions
	  */
	 
	 List<WebElement> allSuggestions=driver.findElements(By.xpath("//div[@aria-label='earphones wired']/ancestor::div[@class='left-pane-results-container']//span"));
	
	 
	 String target="wireless boat";
	 
	 for(WebElement sugg:allSuggestions) {
		
		if(sugg.getText().contains(target))
		{
			System.out.println(sugg.getText());
			break;
		}
		
		
		 }
		 
		 
	 }
	 
}

