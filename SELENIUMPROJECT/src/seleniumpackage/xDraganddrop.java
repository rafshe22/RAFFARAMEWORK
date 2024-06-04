package seleniumpackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xDraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver2.exe");
		ChromeDriver zz=new ChromeDriver();
		zz.get("http://jqueryui.com/droppable");
		zz.switchTo().frame(0);
		WebElement bb=zz.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement cc=zz.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
	Thread.sleep(6000);
	Actions dd= new Actions(zz);
	dd.dragAndDrop(bb, cc).build().perform();
	zz.close();
		
		
		
		
		
	}

}
