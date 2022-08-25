package Regression_test_main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

	@FindBy(xpath = "//span[contains(text(),'AI Flow Dialer')]")
	WebElement AIDSL;

	@FindBy(xpath = "//span[contains(text(),'AI Parallel Dialer')]")
	WebElement AIDML;

	@FindBy(id = "mysession_dialer_mode")
	WebElement Dialermode;

	@FindBy(xpath = "//div[@class='personal']")
	WebElement Flow;

	@FindBy(xpath = "//div[@class='team']")
	WebElement Agent;

	@FindBy(xpath = "//div[@class='aisl']")
	WebElement SingleLine;

	@FindBy(xpath = "//div[@class='aiml']")
	WebElement MultiLine;

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

	@FindBy(xpath = "//a[contains(text(),' Delete Existing Records')]")
	WebElement DeleteList;

	@FindBy(xpath = "//p[contains(text(),'No data available for dialing. Please upload.')]")
	WebElement NoData;

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[3]")
	WebElement Cancel;

	@FindBy(xpath = "//a[text()='Parking Lot']")
	WebElement ParkingLot;

	@FindBy(xpath = "//a[text()='Administration']")
	WebElement Administration;

	@FindBy(xpath = "//input[@id='select_all_parking_lot_records']")
	WebElement SelectAll;

	@FindBy(xpath = "//div[@onclick='deleteSelectedParkingLotRecords()']")
	WebElement DeleteRecords;

	@FindBy(xpath = "//div[@id='no_parking_lot_records_list']")
	WebElement NoRecords;

	@FindBy(xpath = "((//tr[@class='whiterow active-green-tick'])[1]//td[@class='la'])[2]")
	WebElement FirstRow;

	@FindBy(xpath = "//tr[@id='drdt1_sf_report_name']//td[@class='value']")
	WebElement ReportName;

	@FindBy(xpath = "//div[@id='customerdetails_window_save']")
	WebElement Save;

	@FindBy(xpath = "//div[@class='control-sections settings-summary']//li[7]")
	WebElement DialerModeListnames;

	@FindBy(xpath = "(//button[contains(text(),'OK')])[3]")
	WebElement SaveOK;

	@FindBy(xpath = "//p[contains(text(),'All contacts who are unchecked')]")
	WebElement Warning;

	public Dialer_mode_main(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	public void SwitchingDialerMode() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Session']")));

		Actions action = new Actions(driver);
		action.moveToElement(Mysession).click().build().perform();
		Thread.sleep(3000);

		if (driver.findElements(By.xpath("//div[@class='personal']")).size() != 0) {
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AAD).click().build().perform();
			Boolean x = Agent.isDisplayed();
			Assert.assertTrue(x);
			System.out.println("Switching Agent Assisted Dialer works perfectly");

			Thread.sleep(3000);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(FD).click().build().perform();
			Boolean y = Flow.isDisplayed();
			Assert.assertTrue(y);
			System.out.println("Switching Flow Dialer works perfectly");
			Thread.sleep(3000);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AIDSL).click().build().perform();
			Boolean a = SingleLine.isDisplayed();
			Assert.assertTrue(a);
			System.out.println("Switching AI Dialer Single Line works perfectly");
			Thread.sleep(3000);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AIDML).click().build().perform();
			Boolean b = MultiLine.isDisplayed();
			Assert.assertTrue(b);
			System.out.println("Switching AI Dialer Multi Line works perfectly");
		} else {
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(FD).click().build().perform();
			Boolean y = Flow.isDisplayed();
			Assert.assertTrue(y);
			System.out.println("Switching Flow Dialer works perfectly");
			Thread.sleep(3000);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AAD).click().build().perform();
			Boolean x = Agent.isDisplayed();
			Assert.assertTrue(x);
			System.out.println("Switching Agent Assisted Dialer works perfectly");
			Thread.sleep(3000);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AIDSL).click().build().perform();
			Boolean a = SingleLine.isDisplayed();
			Assert.assertTrue(a);
			System.out.println("Switching AI Dialer Single Line works perfectly");
			Thread.sleep(3000);
			action.moveToElement(Dialermode).click().build().perform();
			action.moveToElement(AIDML).click().build().perform();
			Boolean b = MultiLine.isDisplayed();
			Assert.assertTrue(b);
			System.out.println("Switching AI Dialer Multi Line works perfectly");
		}

	}

	public void statistics() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Actions action = new Actions(driver);
		action.moveToElement(Administration).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(ParkingLot).click().build().perform();
		Thread.sleep(2000);

		if (NoRecords.isDisplayed()) {

		} else {
			action.moveToElement(SelectAll).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(DeleteRecords).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(OK).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(OK).click().build().perform();
			Thread.sleep(3000);
		}

		action.moveToElement(MyLists).click().build().perform();
		Thread.sleep(3000);

		Search.sendKeys(prop.getProperty("listname"));

		action.moveToElement(SearchBtn).click().build().perform();
		Thread.sleep(3000);
		// String listname = Listname.getText();
		action.moveToElement(list).click().build().perform();
		action.moveToElement(Begindialing).click().build().perform();
		// Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//b)[last()]")));
		String Prospectscount = Prospects.getText();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnContinueToSession")));

		action.moveToElement(Continue).click().build().perform();
		Thread.sleep(5000);

		Checkall.click();
		Thread.sleep(3000);
		// action.doubleClick(CheckallYes).perform();
		action.moveToElement(CheckallYes).click().build().perform();
		Thread.sleep(5000);
		if (driver.findElements(By.xpath("//p[contains(text(),'All contacts who are unchecked')]")).size() != 0) {
			Thread.sleep(3000);
			action.moveToElement(CheckallYes).click().build().perform();
		}
		action.moveToElement(Checkbox1).click().build().perform();
		action.moveToElement(Checkbox2).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(Donotcallforever).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(DonotOk).click().build().perform();
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
		System.out.println("Current List Statistics working perfectly");

	}

	public void settingssummary() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions action = new Actions(driver);
		action.moveToElement(Settings).click().build().perform();
		if (Autoopen.isSelected()) {

		} else {
			action.moveToElement(Autoopen).click().build().perform();
			action.moveToElement(Savesettings).click().build().perform();
			action.moveToElement(OK).click().build().perform();
			Thread.sleep(5000);

		}
		action.moveToElement(Mysession).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(FirstRow).click().build().perform();
		// action.doubleClick(FirstRow).perform();
		Thread.sleep(3000);
		String Name = ReportName.getText();
		Thread.sleep(3000);
		action.moveToElement(Save).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(SaveOK).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(Dialermode).click().build().perform();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250)");
		action.moveToElement(Settingssummary).click().build().perform();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("scroll(0, 250)");
		Thread.sleep(2000);
		String Listnames = DialerModeListnames.getText();
		System.out.println(Listnames);
		Assert.assertTrue(Listnames.contains(Name));
		Thread.sleep(2000);
		Assert.assertTrue(Enabled.isDisplayed());
		System.out.println();
		System.out.println("Settings Summary working properly");
		System.out.println();
		System.out.println("List Names and Auto Open CRM Settings are updating Properly in Settings Summary");
		System.out.println();
		driver.navigate().refresh();

	}

	public void Delete_Existing_Lists() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions action = new Actions(driver);
		action.moveToElement(Mysession).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(Dialermode).click().build().perform();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("scroll(0, 250)");
		action.moveToElement(DeleteList).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(Cancel).click().build().perform();
		Thread.sleep(2000);
		System.out.println();
		System.out.println("Cancel button is working fine for Delete Existing Lists");
		Thread.sleep(2000);
		action.moveToElement(Dialermode).click().build().perform();
		Thread.sleep(3000);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("scroll(0, 250)");
		action.moveToElement(DeleteList).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(DonotOk).click().build().perform();
		Thread.sleep(5000);
		Assert.assertTrue(NoData.isDisplayed());
		System.out.println();
		System.out.println("Records Deleted Successfully");

	}
}
