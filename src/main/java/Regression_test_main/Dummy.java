package Regression_test_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummy {
	
	@Test
	public void run() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://devqa.koncert.com");
		Thread.sleep(5000);
		driver.findElement(By.id("btn_salesforce")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("testingadmin@koncert.com");
		driver.findElement(By.id("password")).sendKeys("Connect100$");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.close();
	
	}

}
