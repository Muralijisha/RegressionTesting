package Regression_test_main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Baseclass.Baseclass;

public class Dialer_mode_main extends Baseclass {

	@FindBy(xpath = "//a[text()='My Session']")
	WebElement Mysession;

	@FindBy(xpath = "//span[text()='Flow Dialer']")
	WebElement FD;

	@FindBy(xpath = "//span[text()='Agent Assisted Dialer']")
	WebElement AAD;

	@FindBy(id = "mysession_dialer_mode")
	WebElement Dialermode;

	@FindBy(xpath = "//div[@class='personal']")
	WebElement Flow;

	@FindBy(xpath = "//div[@class='team']")
	WebElement Agent;

	@FindBy(xpath = "//a[contains(text(),'My Lists')]")
	WebElement MyLists;

	@FindBy(xpath = "//button[text()='Add Lists']")
	WebElement AddLists;

	@FindBy(xpath = "//a[text()='Add from CSV']")
	WebElement AddFromCsv;

	@FindBy(xpath = "//button[contains(text(),'Add Lists')]")
	WebElement Addlists;

	@FindBy(xpath = "//a[contains(text(),'Add from CSV')]")
	WebElement Addfromcsv;

	@FindBy(id = "uploader")
	WebElement Fileupload;

	@FindBy(id = "uploadnextbtn_0")
	WebElement Next;

	@FindBy(id = "calleridmode")
	WebElement Callerid;

	@FindBy(id = "timezonecst")
	WebElement Cst;

	@FindBy(id = "timezoneest")
	WebElement Est;

	@FindBy(id = "timezonemst")
	WebElement Mst;

	@FindBy(id = "timezonepst")
	WebElement Pst;

	@FindBy(id = "uploadnextbtn_1")
	WebElement Next1;

	@FindBy(id = "uploadnextbtn_2")
	WebElement Next2;

	@FindBy(id = "uploadnextbtn_3")
	WebElement Next3;

	@FindBy(xpath = "//div[contains(@id,'uploadclose_btn')]")
	WebElement Close;

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	WebElement Ok;

	@FindBy(id = "listnamesearch")
	WebElement Search;

	@FindBy(id = "searchlistbtn")
	WebElement SearchBtn;

	@FindBy(id = "beginDialingSessionButton")
	WebElement Begindialing;

	@FindBy(id = "btnContinueToSession")
	WebElement Continue;

	@FindBy(xpath = "(//td[contains(@class,'my-list-checkbox')]//input)[1]")
	WebElement list;

	@FindBy(id = "show_currentList_statistics")
	WebElement currentlist;

	@FindBy(id = "CT_Totalrecords")
	WebElement totalprospects1;

	@FindBy(xpath = "(//b)[last()]")
	WebElement Prospects;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement OK;

	@FindBy(xpath = "//img[@id='checkall']")
	WebElement Checkall;

	@FindBy(xpath = "//div[@id='checkAllDiv']")
	WebElement CheckallYes;

	@FindBy(xpath = "//img[@id='uncheckBoxId1']")
	WebElement Checkbox1;

	@FindBy(xpath = "//img[@id='uncheckBoxId2']")
	WebElement Checkbox2;

	@FindBy(xpath = "//button[@id='doNotCallForeverBtn']")
	WebElement Donotcallforever;

	@FindBy(xpath = "(//button[contains(text(),'OK')])[3]")
	WebElement DonotOk;

	@FindBy(id = "CT_Totalrecordsunchecked")
	WebElement Uncheckcount;

	@FindBy(xpath = "//a[text()='Settings']")
	WebElement Settings;

	@FindBy(xpath = "//input[@id='open_sf_window']")
	WebElement Autoopen;

	@FindBy(xpath = "//div[@id='topsavebutton']")
	WebElement Savesettings;

	@FindBy(xpath = "//span[@id='settings_summary']")
	WebElement Settingssummary;

	@FindBy(xpath = "//li[contains(text(),'Enabled')]")
	WebElement Enabled;

	@FindBy(xpath = "(//td[@class='my-list-listname'])[1]")
	WebElement Listname;

	@FindBy(xpath = "(//li)[76]")
	WebElement Listname1;

	public Dialer_mode_main(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@SuppressWarnings("deprecation")
	public void FlowAndAAD() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Session']")));

		Actions action = new Actions(driver);
		action.moveToElement(Mysession).click().build().perform();
		Thread.sleep(3000);

		// List<WebElement> dynamicElement =
		// driver.findElements(By.xpath("//div[@class='personal']"));

		// WebElement dynamicElement =
		// driver.findElement(By.xpath("//div[@class='personal']"));

		if (driver.findElements(By.xpath("//div[@class='personal']")).size() != 0) {
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AAD).click().build().perform();
			Boolean x = Agent.isDisplayed();
			Assert.assertTrue(x);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(FD).click().build().perform();
			Boolean y = Flow.isDisplayed();
			Assert.assertTrue(y);
		} else {
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

	public void statistics() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(MyLists).click().build().perform();
		// Thread.sleep(3000);
		/*
		 * Addlists.click(); Addfromcsv.click();
		 * Fileupload.sendKeys("D:\\Automation\\TestAutomation\\Murali List1.csv");
		 * Thread.sleep(3000); OK.click(); Thread.sleep(3000); JavascriptExecutor jse1 =
		 * (JavascriptExecutor)driver; jse1.executeScript("scroll(0, 250)");
		 * Next.click(); Thread.sleep(3000); WebElement dropdown = Callerid;
		 * dropdown.click(); Select drop = new Select(dropdown);
		 * drop.selectByVisibleText("Random"); Thread.sleep(2000); Est.click();
		 * Cst.click(); Mst.click(); Pst.click(); Thread.sleep(2000); JavascriptExecutor
		 * jse2 = (JavascriptExecutor)driver; jse2.executeScript("scroll(0, 250)");
		 * Next1.click(); Thread.sleep(3000); Ok.click(); // Thread.sleep(4000);
		 * JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		 * jse3.executeScript("scroll(0, 250)"); Thread.sleep(2000); Next2.click();
		 * Thread.sleep(6000); // Ok.click(); Next3.click(); Thread.sleep(4000);
		 * Ok.click(); Next3.click(); Thread.sleep(3000); Close.click();
		 * Thread.sleep(5000);
		 */
		Search.sendKeys(prop.getProperty("listname"));

		action.moveToElement(SearchBtn).click().build().perform();
		Thread.sleep(3000);
		// String listname = Listname.getText();
		action.moveToElement(list).click().build().perform();
		action.moveToElement(Begindialing).click().build().perform();
		// Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//b)[last()]")));
		String Prospectscount = Prospects.getText();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnContinueToSession")));

		action.moveToElement(Continue).click().build().perform();
		Thread.sleep(5000);

		Checkall.click();
		Thread.sleep(3000);
		// action.doubleClick(CheckallYes).perform();
		action.moveToElement(CheckallYes).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(Checkbox1).click().build().perform();
		action.moveToElement(Checkbox2).click().build().perform();
		Thread.sleep(3000);
		Donotcallforever.click();
		Thread.sleep(3000);
		DonotOk.click();
		Thread.sleep(3000);

		Mysession.click();
		Thread.sleep(3000);
		action.moveToElement(Dialermode).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(currentlist).click().build().perform();
		Thread.sleep(5000);

		String text = totalprospects1.getText();
		Assert.assertTrue(Prospectscount.contains(text));
		String uncheck = "2";
		String count = Uncheckcount.getText();
		Assert.assertTrue(count.contains(uncheck));

	}

	public void settingssummary() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(Settings).click().build().perform();
		if (Autoopen.isSelected()) {
			action.moveToElement(Savesettings).click().build().perform();
			action.moveToElement(OK).click().build().perform();
			action.moveToElement(Mysession).click().build().perform();
			action.moveToElement(Dialermode).click().build().perform();
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("scroll(0, 250)");
			action.moveToElement(Settingssummary).click().build().perform();
			Thread.sleep(2000);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("scroll(0, 250)");
			Thread.sleep(2000);
			Assert.assertTrue(Enabled.isDisplayed());
		} else {
			action.moveToElement(Autoopen).click().build().perform();
			action.moveToElement(Savesettings).click().build().perform();
			action.moveToElement(OK).click().build().perform();
			action.moveToElement(Mysession).click().build().perform();
			action.moveToElement(Dialermode).click().build().perform();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 250)");
			action.moveToElement(Settingssummary).click().build().perform();
			Thread.sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("scroll(0, 250)");
			Thread.sleep(2000);
			Assert.assertTrue(Enabled.isDisplayed());

		}

	}
}
