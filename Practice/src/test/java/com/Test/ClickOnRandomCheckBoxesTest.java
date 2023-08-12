package com.Test;

import org.testng.annotations.Test;

import utility.BaseClass;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ClickOnRandomCheckBoxesTest extends BaseClass {
	
	@Test
public  void main() {
	
	/**
	 * get amazon
	 */
	
	driver.get("https://www.amazon.in/");
	
	
	
	/**
	 * search for earphones
	 */
	
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
	
	driver.findElement(By.xpath("//span[text()='Oppo']"));
	
}
}
