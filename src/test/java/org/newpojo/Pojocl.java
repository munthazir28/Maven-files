package org.newpojo;

import org.BaseClass.Baseclasseeee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojocl extends Baseclasseeee {
	public Pojocl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotpassword;
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement numbertxt;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getForgotpassword() {
		return forgotpassword;
	}
	public WebElement getNumbertxt() {
		return numbertxt;
	}
}
