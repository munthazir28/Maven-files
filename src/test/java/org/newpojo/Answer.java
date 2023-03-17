package org.newpojo;

import org.BaseClass.Baseclasseeee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer extends Baseclasseeee {
	
	public static void main(String[] args) {
		launchBrowser();
		launchurl("https://www.facebook.com/");
		Pojocl l=new Pojocl();
		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		btnclick(forgot);
		filltxt(l.getNumbertxt(), "65785874665846854");
		WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));
		btnclick(search);
		
		
		
		
		
	}

}
