package com.ctg.qa.CTG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Multl_Window {

	@Test
	
	public void ga () {
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
		EdgeOptions opp = new EdgeOptions ();
		opp.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 
		 //Windowhandles one of the method
	}
}
