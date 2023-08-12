package com.Test;

import org.testng.annotations.Test;

import utility.BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DynamicWebTableTest extends BaseClass {
	
	@Test
public  void main() {
		
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	WebElement allrankings=driver.findElement(By.xpath("//div[@class='main-navigation__sub-menu']//a[contains(.,'Rankings')]"));
	Actions act=new Actions(driver);
	act.moveToElement(allrankings);
	/**
	 * in icc web site goto rankings then men's team rankings then fetch all country's name
	 */
	
	List<WebElement> allTeams=driver.findElements(By.xpath("//tbody/tr/td[2]//span[@class='u-hide-phablet']"));
	
	for(WebElement team:allTeams)
	{
		System.out.println(team.getText());
	}
	
	/**
	 * fetch matches played by each country's team along with counrty name
	 */
	for(WebElement team:allTeams)
	{
		String teamName=team.getText();
		String matches=driver.findElement(By.xpath("//span[text()='"+teamName+"']/../following-sibling::td[1]")).getText();
		System.out.println(teamName+"\t"+matches);
	}
	/**
	 * fetch all the country's  name with below 10 matches
	 */
	List<WebElement> matches=driver.findElements(By.xpath("//tbody//td[3][text()<'10']"));
	
	for(WebElement match:matches) {
		String num=match.getText();
		//String country=driver.findElement(By.xpath("//tbody//td[text()='"+num+"' and contains(@class,'u-center-text')]/..//td[2]/span[2]")).getText();
		System.out.println(num);
	}
}
}
