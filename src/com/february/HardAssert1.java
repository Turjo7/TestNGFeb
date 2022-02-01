package com.february;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {
	
	
	/*@Test
	public void test1() {

		try {

			Assert.assertTrue(2 < 1);

			System.out.println("Assertion Failed in Test 1");

			Assert.assertFalse(1 > 0);

			System.out.println("Assertion Failed in Test 1");

			Assert.assertEquals("Sample", "Sample");

			System.out.println("Assertion Passed in Test 1");

		} catch (AssertionError ex) {

			System.out.println(ex);

		}

	}*/

	@Test

	public void test2() {

		try {

			Assert.assertTrue(2 > 1);

			System.out.println("Assertion passed as 2 is greater than 1");

			Assert.assertFalse(1 < 0);

			System.out.println("Assertion passed as 1<0, it is really false");

			Assert.assertEquals("Sample", "Sample");

			System.out.println("Assertion Passed as both the strings are equal");

		} catch (AssertionError ex) {

			System.out.println(ex);

		}

	}

}
