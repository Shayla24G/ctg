  package com.ctg.qa.CTG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_demoblze {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Login_demoblze.ga();
	}
 public static void ga () throws Exception {
 //chromedriver is a pro. of Google,for security purpose selenium give ("--remote-allow-origins-*") for security clearence 
	 	System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		ChromeOptions the= new  ChromeOptions(); //COs one of the class given by selenium
		the.addArguments ("--remote-allow-origins-*"); //selenium give that for security clearence
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");//get method is responsible to open our browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); //is deletecookies a method?
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("loginusername")).sendKeys("Shayla Binte Alam");
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		//driver.switchTo().alert().accept(); //pop up
		Thread.sleep(4000);
		driver.close();
		
		
		
 }
}
