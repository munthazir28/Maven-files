package org.grop;

import org.BaseClass.Baseclasseeee;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gropp3 extends Baseclasseeee{
	@Test(groups = "women",priority = -50,enabled = true )
	private void tc1() {
		System.out.println("tc1");
	}
	@Test(groups = "men",invocationCount = 9,priority = -6,enabled = false)
	private void tc3() {
		System.out.println("tc3");
	}
	@Test(groups = "men",invocationCount = 9,priority = -3)
	private void tc2() {
		System.out.println("tc2");
	}
	@Test(groups = "men",invocationCount = 9,priority = 7)
	private void tc4() {
		System.out.println("tc4");
	}
	@BeforeClass
	private void launch() {
		System.out.println("launch");
	}
	@AfterClass
	private void clos() {
		System.out.println("close");
	}
	@BeforeMethod
	private void dat1() {
		datetime();

	}
	@AfterMethod
	private void dat() {
		datetime();

	}


}
