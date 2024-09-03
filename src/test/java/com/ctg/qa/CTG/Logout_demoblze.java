package com.ctg.qa.CTG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Logout_demoblze {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logout_demoblze.too();
	}
public static void too () throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
	ChromeOptions the= new  ChromeOptions(); //COs one of the class given by selenium
	the.addArguments ("--remote-allow-origins-*");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");//get method is responsible to open our browser
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies(); 
	
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
	 Thread.sleep(3000);
	 driver.close();
	
}
}
