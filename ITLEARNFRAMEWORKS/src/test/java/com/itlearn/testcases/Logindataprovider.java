package com.itlearn.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.Baseclass;
import com.itlearn.pages.LoginPage;
import com.itlearn.utilities.ReadExcelfile;

public class Logindataprovider extends Baseclass{
	String fileName=System.getProperty("user.dir")+"\\TestData\\loginData.xlsx";
	
	@Test(dataProvider="loginDataProvider")
	public void loginVerify(String username,String password) 
		{
		LoginPage lp= new LoginPage(driver);
		
		lp.login(username,password);
		lp.logout();
		}

	@DataProvider
	public String[][] loginDataProvider()
	{
		int ttlRows= ReadExcelfile.getRowCount(fileName, "Login");
		System.out.println(ttlRows);
		int ttlColumns= ReadExcelfile.getColCount(fileName, "Login");
		System.out.println(ttlColumns);
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelfile.getCellValue(fileName, "Login", i, j);
			}
		}
		return data;
	}

	
	
	
	

	
	
		
}
