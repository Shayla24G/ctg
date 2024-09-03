package com.ctg.qa.CTG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class drop_down {
	 
	 WebDriver driver;
	 ChromeOptions he;
	 Select obj = new Select(driver.findElement(By.id("gh-cat"))); //locator of dropdown(select)
	@Test
	
	
	public void dd () throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		 ChromeOptions he = new  ChromeOptions ();
		 he.addArguments ("--remote-allow-origins=*");
		 driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 
		 obj.selectByValue("12576");
		 
		 Thread.sleep(4000);
		 driver.close();
	}
}
	
