package Regression_test_main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dialer_mode_main {
	
	@FindBy(xpath="//a[text()='My Session']")
	WebElement Mysession;
	
	@FindBy(xpath="//span[text()='Flow Dialer']")
	WebElement FD;
	
	@FindBy(xpath="//span[text()='Agent Assisted Dialer']")
	WebElement AAD;
	
	@FindBy(id="mysession_dialer_mode")
	WebElement Dialermode;
	
	@FindBy(xpath="//div[contains(@class,'personal')]")
	WebElement Flow;
	
	@FindBy(xpath="//div[contains(@class,'team')]")
	WebElement Agent;
	
	public Dialer_mode_main(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 
	 public void FlowAndAAD() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Session']")));
		
			Actions action = new Actions(driver);
			action.moveToElement(Mysession).click().build().perform();
			Thread.sleep(3000);
		
			if(Flow.isDisplayed())
			{
				action.moveToElement(Dialermode).click().build().perform();
				action.moveToElement(AAD).click().build().perform();
				Boolean x = Agent.isDisplayed();
				Assert.assertTrue(x);
				action.moveToElement(Dialermode).click().build().perform();
				action.moveToElement(FD).click().build().perform();
				Boolean y = Flow.isDisplayed();
				Assert.assertTrue(y);
				
	
			}
			else {
				action.moveToElement(Dialermode).click().build().perform();
				action.moveToElement(FD).click().build().perform();
				Boolean y = Flow.isDisplayed();
				Assert.assertTrue(y);
				action.moveToElement(Dialermode).click().build().perform();
				action.moveToElement(AAD).click().build().perform();
				Boolean x = Agent.isDisplayed();
				Assert.assertTrue(x);
				
			}
}
}
