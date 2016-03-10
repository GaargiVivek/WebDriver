package com.openqa.selenium;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver()
	{
		System.out.println("Launching Firefox");
	}

	public void click(String locator) {
		
		System.out.println("Clicked on an element in Firefox :"+locator);
	}

	public void sendKeys(String locator, String value) {
		
		System.out.println("Typed in an element in Firefox  "+locator+" value enterd is :"+value);
		
	}

}
