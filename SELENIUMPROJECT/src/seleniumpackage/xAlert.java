package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xAlert {

	private static String alert;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver. Crome.Driver","C:\\Program Files\\chromedriver2.exe");
ChromeDriver x=new ChromeDriver();
x.get("http://www.training.qaonlinetraining.com/testPage.php");
x.findElement(By.name("name")).sendKeys("Rafath");
x.findElement(By.name("email")).sendKeys("rafshe22@yahoo.com");
x.findElement(By.name("website")).sendKeys("www.itlearn360.com");
x.findElement(By.name("comment")).sendKeys("this website  online classes are free");
x.findElement(By.xpath("/html/body/form/input[5]")).click();
x.findElement(By.xpath("/html/body/form/input[7]")).click();
x.findElement(By.xpath("/html/body/form/input[8]")).click();
x.findElement(By.xpath("/html/body/form/input[9]")).click();
x.findElement(By.xpath("/html/body/form/input[10]")).click();
x.findElement(By.xpath("/html/body/form/select[1]")).click();
x.findElement((By.xpath("/html/body/form/input[11]"))).click();

x.findElement(By.id("alert")).click();
Alert z=x.switchTo().alert();
System.out.println(z.getText());
Thread.sleep(6000);
z.accept();


x.findElement(By.id("confirm")).click();
Alert z1=x.switchTo().alert();
System.out.println(z1.getText());
Thread.sleep(6000);
z1.dismiss();

x.findElement(By.id("prompt")).click();
Alert z2=x.switchTo().alert();
System.out.println(z2.getText());
 z2.sendKeys("rafath");
 Thread.sleep(6000);
z2.accept();











	}

}
