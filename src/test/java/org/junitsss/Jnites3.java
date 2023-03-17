package org.junitsss;

import org.BaseClass.Baseclasseeee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Jnites3 extends Baseclasseeee {
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
	@Test
	public void tc1() {
		Assert.assertTrue(true);
		System.out.println("tc1");
	}
	@Test
	public void tc4() {
		Assert.assertTrue(false);
		System.out.println("tc4");
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("tc3");
	}
	@BeforeClass
	public static void launch() {
		System.out.println("Start/////////>");
	}
	@AfterClass
	public static void clo() {
		System.out.println("End\\\\\\\\\\<");
	}
	@Before
	public void datee1() {
		datetime();
	}
	@After
	public void datee() {
		datetime();
	}


}
