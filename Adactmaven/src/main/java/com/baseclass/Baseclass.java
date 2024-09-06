
package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void geturl(String url)
	{
		driver.get(url);
	}
	public static void sendValues(WebElement element, String value) {

		element.sendKeys(value);
	}
	public static void clickelement(WebElement element)
	{
		element.click();
		}
	public static void selectvalues(WebElement element, int value)
	{
	Select h= new Select(element);
	h.selectByIndex(value);
	}
}
