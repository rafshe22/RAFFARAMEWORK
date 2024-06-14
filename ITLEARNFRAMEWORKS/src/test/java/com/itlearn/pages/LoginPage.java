package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginlabel") WebElement loginclick;
	@FindBy(id="user_login") WebElement user;
	@FindBy(id="user_pass") WebElement pass;
	@FindBy(name="wp-submit") WebElement submitClick;
	
@FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;
	
	public void login(String username,String password)
	{
		loginclick.click();
		user.sendKeys(username);
		pass.sendKeys(password);
		submitClick.click();
	}
	
	public void logout()
	{
		logoutimage.click();
		logoutclick.click();
	}
	
}
