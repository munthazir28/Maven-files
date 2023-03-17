package org.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Baseclasseeee{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement emailtxt;
	@FindBy(name="pass")
	private WebElement passtxt;
	public WebElement getEmailtxt() {
		return emailtxt;
	}
	public WebElement getPasstxt() {
		return passtxt;
	}

}
