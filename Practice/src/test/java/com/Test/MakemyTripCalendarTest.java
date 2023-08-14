package com.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.BaseClass;

public class MakemyTripCalendarTest extends BaseClass{

	@Test(enabled=true)
	public void calendarTest() throws Throwable {
		
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.click().perform();
	Thread.sleep(2000);
	act.click().perform();
	Thread.sleep(2000);
	act.click().perform();
	
	//driver.findElement(By.xpath("//i[contains(@class,'we_close')]")).click();
	
	
  
			//wb.click();
	           Calendar cal = Calendar.getInstance();
	           cal.add(Calendar.DAY_OF_YEAR, 3);
	           Date d = cal.getTime();
			//Date d = new Date();
			String[] dArr = d.toString().split(" ");
			String day = dArr[2];
			String month = dArr[1];
			String year = dArr[5];
			String time = dArr[3].replace(":", "-");
			
			String date = day+"-"+month+"-"+year;
			System.out.println(date);
			driver.findElement(By.xpath("//label[@for='departure']")).click();
			driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]//p[.='"+day+"']")).click();
			Thread.sleep(4000);
			
			int num=Integer.parseInt(day);
			int desiredDay=num+2;
			String dy=""+desiredDay;
			
					driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']")).click();
			driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//p[.='"+dy+"']")).click();
			System.out.println("passed");

		
   
		
		
	}
}
	

