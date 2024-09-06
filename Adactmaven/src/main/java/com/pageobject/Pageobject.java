package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {
	public static WebDriver driver;
	@FindBy (id="username")
	private WebElement uname;
	@FindBy (id="password")
	private WebElement pasword;
	@FindBy (id="login")
	private WebElement login;
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPasword() {
		return pasword;
	}
	public WebElement getLogin() {
		return login;
	}
	public Pageobject(WebDriver abc)
	{
		driver=abc;
		PageFactory.initElements(driver, this);
	}
	}
	

