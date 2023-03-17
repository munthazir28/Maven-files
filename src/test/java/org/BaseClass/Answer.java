package org.BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer extends Baseclasseeee {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser();
		launchurl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Datadriven("Sheet1", 0, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys(Datadriven("Sheet1", 1, 0));
		WebElement login = driver.findElement(By.name("login"));
		btnclick(login);
		
		
		
		
		
		
		
		
	}

}
