package com.testrunner;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Baseclass;
import com.pageobject.Pageobject;
import com.pageobjectmanager.Pageobjectmanager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testrunner extends Baseclass{

	public static void main(String[] args) {
		browserLaunch();
		//Pageobject pom = new  Pageobject(driver);
		Pageobjectmanager poms = new Pageobjectmanager (driver);
		geturl("https://adactinhotelapp.com/index.php");
		//WebElement uname = driver.findElement(By.id("username"));
		sendValues(poms.getinstancelogin().getUname(), "dhivyabharathin");
		//WebElement pasword = driver.findElement(By.id("password"));
		sendValues(poms.getinstancelogin().getPasword(),"divirathi15");
		//WebElement login = driver.findElement(By.id("login"));
		clickelement(poms.getinstancelogin().getLogin());
		
		
		selectvalues(poms.search().s_location(),1);
		selectvalues(poms.search().s_hotels(),2);
		selectvalues(poms.search().s_rmtype(),1);
		selectvalues(poms.search().s_roomno(),3);
		WebElement datein = poms.search().s_datein();
		datein.clear();
		sendValues(datein,"07/07/2024");
		WebElement dateout = poms.search().s_dateout();
		dateout.clear();
		sendValues(dateout,"08/07/2024");
		selectvalues(poms.search().s_adult(),2);
		selectvalues(poms.search().s_child(),2);
		clickelement(poms.search().s_submit());
		clickelement(poms.search().clickk());
		clickelement(poms.search().submt());
		
		sendValues(poms.bookin().f_name(),"dhivya");
		sendValues(poms.bookin().l_name(),"bharathi");
		sendValues(poms.bookin().addres(),"madurai");
		sendValues(poms.bookin().ccnum(),"1234567890987654");
		selectvalues(poms.bookin().type(),1);
		selectvalues(poms.bookin().month(),2);
		selectvalues(poms.bookin().year(),5);
		sendValues(poms.bookin().cvno(),"2345");
		clickelement(poms.bookin().buton());
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		clickelement(poms.bookin().close());
		
		

	}

}
