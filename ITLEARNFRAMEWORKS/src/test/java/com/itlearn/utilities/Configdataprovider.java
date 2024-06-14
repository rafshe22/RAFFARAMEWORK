package com.itlearn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configdataprovider {

	Properties pro;
	
	public Configdataprovider() 
	{
		File src = new File("./Confrigation/Config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The file is not found");
		}
	}
	
	
	public String getbrowser()
	{
		return pro.getProperty("browser");
	}
	
	public String getUrl()
	{
		return pro.getProperty("url");
	}
}
