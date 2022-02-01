package com.february;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	
	@DataProvider(name="DataPro")
	public Object[][] dpMethod(){
		
		
		return new Object[][] {{"Nasir"},{"Uddin"},{"Ahmed"},{"Turjo"}};
	} 
	
	
	@Test(dataProvider="DataPro")
	public void myPrint(String values) {
		System.out.println(values);
	}

}
