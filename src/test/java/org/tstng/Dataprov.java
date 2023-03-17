package org.tstng;

import org.BaseClass.Baseclasseeee;
import org.BaseClass.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprov extends Baseclasseeee{
	@Test(dataProvider = "testingresult")
	private void tc1(String user,String pass) {
		launchurl("https://www.facebook.com/");
		LoginPojo l=new LoginPojo();
		filltxt(l.getEmailtxt(), user);
		filltxt(l.getPasstxt(), user);
		WebElement login = driver.findElement(By.name("login"));
		btnclick(login);

	}
	@BeforeClass
	private void launch() {
		launchBrowser();
		
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
	@DataProvider(name="testingresult")
	public String[][] data() {
		return new String[][]{
			{"munthazir","908668687"},
			{"imran","90870987870"},
			{"kashif","098686876"},
			{"naushad","0986876"},
			{"max","090-9790"},
			{"riyaz","46464523432"},
			{"rizwan","344634"},
			{"aman","4353453"},
			{"thameem","343453"},
			{"hashimm","5323232"},
			{"usmanmullar","54325345323"},
			{"asalt","554354432"},
			{"safdar","35343445"},
			{"naimu","532532"}
			
		};

	}

}
