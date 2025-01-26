package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//h5[text()='Login']")
	WebElement logintext;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginbtn;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/child::li[8]/descendant::span")
	WebElement validateHome;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ValidateHomePage()
	{
		String logo=logintext.getText();
		
		if(logo.contains("Login"))
		{
			System.out.println("User is on main login page");
		}
		else
		{
			System.out.println("not on login page");
		}
	}
	
	public void LoginFunctionality()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
	}
	
	public void ValidateLogin()
	{
		String dash=validateHome.getText();
		if(dash.contains("Dashboard"))
		{
			System.out.println("successfully logged in");
		}
		else
		{
			System.out.println("invalid credentials");		}
	}
}
