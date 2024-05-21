package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xfillform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver2.exe");
		ChromeDriver Zell=new ChromeDriver();
		Zell.get("http://training.qaonlinetraining.com/testPage.php");
		Zell.findElement(By.name("name")).sendKeys("Rafath sheriff");
		Zell.findElement(By.name("email")).sendKeys("rafshe22@yahoo.com");
	Zell.findElement(By.name("website")).sendKeys("www.itlearn360.com");
		Zell.findElement(By.name("comment")).sendKeys("goodlearning website");
	Zell.findElement(By.xpath("/html/body/form/input[5]")).click();
	Zell.findElement(By.xpath("/html/body/form/input[10]")).click();
	Zell.findElement(By.xpath("/html/body/form/input[9]")).click();
	Zell.findElement(By.xpath("/html/body/form/input[7]")).click();
	
Zell.findElement(By.name("submit")).click();
}
	
	}


