package base_app;


import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.Baseclass;

public class Base_App_Test extends Baseclass {
	Base_App_Main main;
	
	
	@BeforeMethod
	public void setup() {
		initializationCP();
		main = new Base_App_Main(driver);
	
		
		
		
	}
	@Test
	public void main() throws InterruptedException, AWTException {
		main.New_Org_Setup();
	}
	
	@AfterMethod
	public void teardown() {
//		driver.quit();;
	}

}
