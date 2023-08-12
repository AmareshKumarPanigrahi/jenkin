package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
    public static WebDriver driver =null;
	@BeforeTest
	public void dbConnection() {
		System.out.println("connected rto db");
	}
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64" );
		WebDriver driver=null;
		if(browser.equals("edge")) {
		EdgeOptions opt =new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 driver=new EdgeDriver(opt);
		}
		else if(browser.equals("chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.setBinary("C:\\selenium\\chrome-win64\\chrome.exe");
			//opt.addArguments("--remote-allow-origins=*");
			 driver =new ChromeDriver(opt);
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void actionStarted() {
		
		System.out.println("WebAction Started");
		
		
	}
	@AfterMethod
	public void afterAction() {
		
		System.out.println("WebAction completed");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("closing Browser");
		driver.close();
		
	}
	@AfterTest
	public void closedBconection() {
		System.out.println("DB connection closed");
	}
			
			
			
	
	
	
	
	
	
	
	
	
	
	
}
