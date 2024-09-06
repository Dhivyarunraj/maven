package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	public WebDriver driver;
	@FindBy(xpath= "//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath= "//input [@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy (xpath="//input[@name='cc_num']")
	private WebElement ccno;
	@FindBy (xpath="//select[@name='cc_type']")
	private WebElement cctype;
	@FindBy (xpath="//select[@name='cc_exp_month']")
	private WebElement ccmnth;
	@FindBy (xpath="//select[@name='cc_exp_year']")
	private WebElement ccyear;
	@FindBy (xpath= "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy (xpath="//input[@type='button']")
	private WebElement btn;
	@FindBy (id="logout")
	private WebElement logut;
	public WebElement f_name()
	{
		return firstname;
	}
	public WebElement l_name()
	{
		return lastname;
	}
	public WebElement addres()
	{
		return address;
	}
public WebElement ccnum()
{
	return ccno;
}
public WebElement type()
{
	return cctype;
	
}
public WebElement month()
{
	return ccmnth;
}
public WebElement year()
{
	return ccyear;
}
public WebElement cvno()
{
	return cvv;
}
public WebElement buton()
{
	return btn;
}
public WebElement close()
{
	return logut;
}
public Bookhotel(WebDriver abc)
{
	driver=abc;
	PageFactory.initElements(driver, this);
}
}



	
	
	
	
	


