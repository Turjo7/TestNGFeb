package com.february;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	
	@DataProvider(name="DataPro")
	public Object[][] dpMethod(){
		
		
		return new Object[][] {{2,3,5},{6,7,8},{9,10,11}};
	} 
	
	
	@Test(dataProvider="DataPro")
	public void myPrint(int a,int b,int c) {
		System.out.println("The Sum: "+(a+b+c));
	}

}
