package Tngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tngopenwebsite {
	
	
	WebDriver zz;
	@Test
	public void tngopenamazon() throws InterruptedException{
		
		System.setProperty("WebDriver Chrome.Driver", "C:\\Program Files\\ChromeDriver2.exe");
		zz=new ChromeDriver();
		zz.get("http://www.amazon.com/");
		System.out.println("This is amazon website with text ");
		Thread.sleep(6000);
		zz.close();
		}
	
	
	@Test
	public void tngcnbc() throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver","C:\\Program Files\\ChromeDriver2.exe" );
	zz = new ChromeDriver();
	zz.get("https://www.cnbc.com/");
	System.out.println("this we site is cnbc with the text");
	Thread.sleep(6000);
	zz.close();
	
	
	
	}

	
	@Test
	public void tngyahoo() throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver","C:\\Program Files\\ChromeDriver2.exe");
	zz= new ChromeDriver();
	zz.get("http://www.yahoo.com/");
	System.out.println("this is yahoo web site with the text");
	Thread.sleep(6000);
	zz.close();

	}}