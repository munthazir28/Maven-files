package org.tstng;

import org.BaseClass.Baseclasseeee;
import org.BaseClass.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TstNG extends Baseclasseeee {
	@Test
	private void tc1() {
		
		LoginPojo l=new LoginPojo();
		filltxt(l.getEmailtxt(), "syed123456");
		filltxt(l.getPasstxt(), "9857678697");
		WebElement login = driver.findElement(By.name("login"));
		btnclick(login);

	}
	@BeforeClass
	private void launch() {
		launchBrowser();
		launchurl("https://www.facebook.com/");
	}
	@AfterClass
	private void cloose() {
		System.out.println("close");
	}
	@BeforeMethod
	private void time1() {
		datetime();
	}
	@AfterMethod
	private void time() {
		datetime();
	}
	

}
