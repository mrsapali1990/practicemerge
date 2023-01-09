package com.ZP.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ZP.commons.BaseClass;
import com.ZP.pageObjects.HomePage;
import com.ZP.utilities.TestUtil;

public class HomePageTest extends BaseClass{

	HomePage hp;
	static String wbsheet="MfgDetails";

	public HomePageTest() throws IOException
	{
		super();
	}

	@BeforeMethod()
	public void setup()
	{
		launchApp();
		hp=new HomePage();
	}
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		
		ArrayList<Object[]> testData=TestUtil.getDataFromExcel(wbsheet);
		return testData.iterator();

	}
	
	@Test(dataProvider="getTestData")
	public void bikeDetails(String Manufacturer) throws Exception{
		hp.search(Manufacturer);
		
	}
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}

}
