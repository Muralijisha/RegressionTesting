package Regression_Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Loginpage.HomePage;
import com.at.Loginpage.Loginpage;

import Baseclass.Baseclass;
import Regression_test_main.Dialer_mode_main;
import io.qameta.allure.Description;



public class Dialer_mode_test extends Baseclass {
	Loginpage loginpage;
	HomePage home;
	Dialer_mode_main main;
	
	@BeforeMethod   
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new Loginpage();
		home=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		main = new Dialer_mode_main(driver);
		
	}	
		@Test(priority=1)
		@Description("Check switching between Team Dialer & personal dialer")
		public void FD_AAD() throws InterruptedException {
			main.FlowAndAAD();
		}
		
		@Test(priority=2)
		@Description("Current List Statistics")
		public void CurrentListStatistics() throws InterruptedException {
			main.statistics();
		}
		
		@Test(priority=3)
		@Description("Settings summary")
		public void settingssummary() throws InterruptedException {
			main.settingssummary();
		}
		
		
		
		@AfterMethod
		public void screenShot(){
		
			driver.quit();
		}
}
