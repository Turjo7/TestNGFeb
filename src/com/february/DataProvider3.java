package com.february;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider3 {
	@DataProvider(name="DataPro")
	public Object[][] dpMethod(){
		
		
		return new Object[][] {{"Nasir Uddin Ahmed"},{"Turjo Ahmed"}};
	} 
	
	
	@Test(dataProvider="DataPro")
	public void myPrint(String userName) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ui.appen.com.cn/user/login"); 
		WebElement val1 = driver.findElement(By.id("name"));
		val1.sendKeys(userName);
		
		
		
		
	}

}
