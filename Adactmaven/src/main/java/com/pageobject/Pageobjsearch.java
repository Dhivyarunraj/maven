package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjsearch {
	public WebDriver driver;
@FindBy(id="location")
private WebElement location;
@FindBy (id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement rmtype;
@FindBy (id="room_nos")
private WebElement norooms;
@FindBy (id="datepick_in")
private WebElement chkin;
@FindBy (id="datepick_out")
private WebElement chkout;
@FindBy(id="adult_room")
private WebElement adultrm;
@FindBy(id="child_room")
private WebElement childrm;
@FindBy (id="Submit") 
private WebElement search;
@FindBy(id="radiobutton_0")
private WebElement clk;
@FindBy(id="continue")
private WebElement cntnue;
public WebElement s_location()
{
	return location;
}
public WebElement s_hotels()
{
	return hotel;
	}
public WebElement s_rmtype()
{
	return rmtype;
	}
public WebElement s_roomno()
{
return norooms;
}
public WebElement s_datein()
{
	return chkin;
	}
public WebElement s_dateout()
{
	return chkout;
	}
public WebElement s_adult()
{
return adultrm;	
}
public WebElement s_child()
{
	return childrm;
}
public WebElement s_submit()
{
return search;
}
public WebElement clickk()
{
	return clk;
}
public WebElement submt()
{
	return cntnue;
}
public Pageobjsearch (WebDriver abc)
{
driver=abc;
PageFactory.initElements(driver, this);
}
}




