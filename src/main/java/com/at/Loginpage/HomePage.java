package com.at.Loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class HomePage extends Baseclass {
	@FindBy(xpath= "//a[@title='Dashboard']")
	WebElement headerLabel;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomepageTitle() {
		return driver.getTitle();
	}

}
