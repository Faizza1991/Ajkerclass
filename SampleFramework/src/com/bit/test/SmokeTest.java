package com.bit.test;

import org.junit.Test;

import businessapplication.CoreStep;

public class SmokeTest extends BaseTest  {
	
	@Test
	public void test1() {
		
		CoreStep c=new CoreStep();
		c.verifyHomePageTitle();
		c.verifyHomePage();
		c.hoverOverOnMortgage();
		
	}

}
