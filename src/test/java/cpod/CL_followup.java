package cpod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CL_followup {
	WebElement driver;
	
	@BeforeTest
	public void login() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Automation\\TestAutomation\\data.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id("btn_salesforce")).click();
	    Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("Login")).click();
	}
	@Test
	public void main() throws InterruptedException {
		Thread.sleep(5000);
		WebElement list = driver.findElement(By.id("navMyLists"));
		list.click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("listnamesearch")).sendKeys("Koncert Follow Ups (Not due)");
	    driver.findElement(By.id("searchlistbtn")).click();
	    WebElement confirm1 = driver.findElement(By.className("my-list-listname1"));
		Thread.sleep(2000);
    	if(confirm1.getText().contains("Koncert Follow Ups (Not due)"))
		{
			System.out.println("In My Lists CL Follow ups(Not due) changed to Koncert Follow ups (Not due)");
			System.out.println("Its Working Perfectly");
			System.out.println("");
         }
	    else {
	    	System.out.println("In My Lists CL Follow ups(Not due) Not changed to Koncert Follow ups (Not due)");
			System.out.println("Having Error in Koncert Follow ups(Not due)");
			System.out.println("");
		}
    	
    	Thread.sleep(2000);
    	driver.findElement(By.id("listnamesearch")).clear();
    	driver.findElement(By.id("listnamesearch")).sendKeys("Koncert Follow Ups (Past due)");
    	driver.findElement(By.id("searchlistbtn")).click();
	    WebElement confirm2 = driver.findElement(By.className("my-list-listname1"));
		Thread.sleep(2000);
    	if(confirm2.getText().contains("Koncert Follow Ups (Past due)"))
		{
			System.out.println("In My Lists CL Follow ups(Past due) changed to Koncert Follow ups (Past due)");
			System.out.println("Its Working Perfectly");
         }
	    else {
	    	System.out.println("In My Lists CL Follow ups(Past due) Not changed to Koncert Follow ups (Past due)");
			System.out.println("Having Error in Koncert Follow ups (Past due)");
		}
    	
    	Thread.sleep(2000);
		
	}
		
	}


