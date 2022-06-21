package com.at.Loginpage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Baseclass.Baseclass;
import io.qameta.allure.Step;

public class Loginpage extends Baseclass {

	HomePage homepage;

	

	@FindBy(id = "btn_salesforce")
	WebElement signInWithSalesforce;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "Login")
	WebElement loginBtn;

	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	WebElement settingsTab;

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@Step("Login with username: {0}, password: {1} step :")
	public HomePage login(String un, String pwd) {


		signInWithSalesforce.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		jsExecutor_ClickElement(loginBtn);

		return new HomePage();
	}

}
