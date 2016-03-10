package com.openqa.selenium;

public class InternetExplorerDriver implements WebDriver {
	
	public InternetExplorerDriver()
	{
		System.out.println("Launching IE");
	}

	public void click(String locator) {
		
		System.out.println("Clicked on an element in IE :"+locator);
	}

	public void sendKeys(String locator, String value) {
		
		System.out.println("Typed in an element in IE "+locator+" value enterd is :"+value);
		
	}

}
