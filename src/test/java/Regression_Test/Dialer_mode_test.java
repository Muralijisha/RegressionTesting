package Regression_Test;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.at.Loginpage.HomePage;
import com.at.Loginpage.Loginpage;

import Baseclass.Baseclass;
import Regression_test_main.Dialer_mode_main;
import allureListener.TestAllureListener;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners({ TestAllureListener.class })
public class Dialer_mode_test extends Baseclass {
	Loginpage loginpage;
	HomePage home;
	Dialer_mode_main main;

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new Loginpage();
		home = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		main = new Dialer_mode_main(driver);

	}

	@Test(priority = 1)
	@Description("Check switching between Team Dialer & personal dialer")
	@Severity(SeverityLevel.MINOR)
	
	public void SwitchingDialerMode() throws InterruptedException {
		main.SwitchingDialerMode();
	}

	@Test(priority = 2)
	@Description("Current List Statistics")
	public void CurrentListStatistics() throws InterruptedException {
		main.statistics();
	}

	@Test(priority = 3)
	@Description("Settings summary")
	public void settingssummary() throws InterruptedException {
		main.settingssummary();
	}

	@Test(priority=4)
	@Description("Delete Existing Records")
	public void DeleteExistingLists() throws InterruptedException {
		main.Delete_Existing_Lists();
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus())
		{
			Allure.addAttachment(result.getName(),new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
		driver.quit();
	}
}
