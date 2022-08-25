package base_app;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import Baseclass.Baseclass;

public class Base_App_Main extends Baseclass {
	
	@FindBy(xpath = "(//input[@id='name'])[1]")
	WebElement Firstname;
	
	@FindBy(xpath = "(//input[@id='name'])[2]")
	WebElement Lastname;
	
	@FindBy(xpath = "(//input[@id='name'])[3]")
	WebElement Email;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Checkbox;
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	WebElement Humancheck;
	
	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	WebElement Createaccount;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement Signin;
	
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement Username;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement Next;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
/*	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement Gmailsignin;
	
	@FindBy(id = "identifierId")
	WebElement GUsernAME;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement GPassword;   */
	
	

	public Base_App_Main(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	WebDriver driver;
	
	public void New_Org_Setup() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Firstname.sendKeys(prop.getProperty("Firstname"));
		int random = (int)(Math.random()*1000);
		String entername = prop.getProperty("Lastname");
		String currentname = entername+random;
		Lastname.sendKeys(currentname);
		Email.sendKeys(prop.getProperty("Email"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250)");
		Actions action = new Actions(driver);
		action.moveToElement(Checkbox).click().build().perform();
		Thread.sleep(3000);
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		driver.switchTo().frame(iFrame);

		WebElement iFrame_checkbox = 
				driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
				iFrame_checkbox.click();
				
	    driver.switchTo().defaultContent();		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Create Account')]")));
		action.moveToElement(Createaccount).click().build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND + "t");
	    driver.get("https://www.google.com/gmail/about/");
	    
	    Thread.sleep(3000);
	    action.moveToElement(Signin).click().build().perform();
	    Thread.sleep(3000);
	    Username.sendKeys(prop.getProperty("Email"));
	    Thread.sleep(3000);
	    action.moveToElement(Next).click().build().perform();
	    Thread.sleep(3000);
	    Password.sendKeys(prop.getProperty("Password"));
	    Thread.sleep(3000);
	    action.moveToElement(Next).click().build().perform();
	    Thread.sleep(8000);
	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_HOME);
	    robot.keyRelease(KeyEvent.VK_HOME);

	//Procedure to find first email by subject and click the link in it

	    Thread.sleep(5000);
	List<WebElement> email = driver.findElements(By.cssSelector("#divSubject"));

	for(WebElement emailsub : email){

	    if(emailsub.getText().equals("Welcome to Koncert. Begin your high-velocity sales growth now") == true){
	           emailsub.click();
	           break;
	        }
	    }
	    
	    
		
		
		
		
	}
	
	
	
	
		
	
}

