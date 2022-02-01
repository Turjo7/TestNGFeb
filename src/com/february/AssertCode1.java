package com.february;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssertCode1 {
	
	
	WebDriver driver = new ChromeDriver();

	
	

	@Test(priority = 0)
	public void closeBrowser () {
		
		driver.close();
		// Reporter.log("Driver Closed After Testing");

	}

	@Test(priority = 1)
	public void openBrowser() {

		// Reporter.log("This test verifies the current selenium compatibility with
		// TestNG by launching the chrome driver");
		// Reporter.log("Launching Google Chrome Driver version 81 for this test");

		

		driver.get("https://github.com/");
		String expectedTitle = "GitHub";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle);

	}

}
