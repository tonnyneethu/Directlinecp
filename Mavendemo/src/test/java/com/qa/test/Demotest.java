package com.qa.test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demotest {
	
	@Test
	public void sum()
	{
		System.out.println("SUM");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
		
	}
	
	@Test
	public void Sub()
	{
		System.out.println("SUBTRACTION");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
		
	}

}
