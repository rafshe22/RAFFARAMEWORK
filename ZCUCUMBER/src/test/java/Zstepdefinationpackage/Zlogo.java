package Zstepdefinationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Zlogo {
	
	WebDriver LL;
	WebElement googlelogo;
	
	@Given("Go website {string}")
	public void go_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Program Files\\\\chromedriver2.exe");
		LL=new ChromeDriver();
		LL.get(string);
	   
	}

	@When("Search google logo webelement")
	public void search_google_logo_webelement() {
	    // Write code here that turns the phrase above into concrete actions
		googlelogo.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		System.out.println("store google logo");
		
		
	   
	}

	@Then("Display google logo webelement")
	public void display_google_logo_webelement() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true,googlelogo.isDisplayed());
		System.out.println("Display googlelogo Assert passed");
		
		
	    
	}



	
	
	
	
	
	
	
	

}
