package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTimeLink {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "cc\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\\\\\\\Users\\\\\\\\ac\\\\\\\\Downloads\\\\\\ActiTime");
		Thread.sleep(2000);
	driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("Anny");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("Anny123");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}

}
