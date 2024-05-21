package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class xopenwebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver2.exe");
ChromeDriver zell=new ChromeDriver();
	      zell.get("http://www.amazon.com/");
	}


}