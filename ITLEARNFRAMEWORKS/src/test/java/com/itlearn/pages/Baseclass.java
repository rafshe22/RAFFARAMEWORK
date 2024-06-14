package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.itlearn.utilities.BrowserFactory;
import com.itlearn.utilities.Configdataprovider;
import com.itlearn.utilities.ReadExcelfile;

public class Baseclass {
	
	public WebDriver driver;
	Configdataprovider cf=new Configdataprovider();
	ReadExcelfile zz= new ReadExcelfile();
	
	@BeforeClass
	public void setup() {
	driver=BrowserFactory.startApplication(driver, cf.getbrowser(), cf.getUrl());
		
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.close();
//	}
}
