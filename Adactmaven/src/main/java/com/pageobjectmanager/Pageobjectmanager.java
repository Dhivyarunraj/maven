package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageobject.Bookhotel;
import com.pageobject.Pageobject;
import com.pageobject.Pageobjsearch;

public class Pageobjectmanager {
	WebDriver driver;
private Pageobject pom;

public Pageobject getinstancelogin()
{
	if(pom==null) {
	pom= new Pageobject(driver);
	}
	return pom;
	}
private Pageobjsearch psearch;
public Pageobjsearch search() {
	if(psearch==null) {
psearch= new Pageobjsearch(driver);
	}
return psearch;
}
//private Bookhotel book;
//public Bookhotel booking()
//{
//if(book==null)
//{
//	book= new Bookhotel(driver);
//	
//}
//return book;
//}
private Bookhotel book;
public Bookhotel bookin()
{
	if(book==null)
	{
		book= new Bookhotel(driver);
	}
	return book;
	}

public Pageobjectmanager (WebDriver abc)
{
	driver=abc;
	//PageFactory.initElements(driver, this);
	}
}
