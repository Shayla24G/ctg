package com.ctg.qa.CTG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sign_up {

	public static void main(String[] args) throws Exception {
		Sign_up.he(); 

	}
	public static void he () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome_Driver\\chromedriver.exe");
		ChromeOptions the= new  ChromeOptions(); //COs one of the class given by selenium
		the.addArguments ("--remote-allow-origins-*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");//get method is responsible to open our browser
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000); //wait time
		
		driver.findElement(By.id("sign-username")).sendKeys("Shayla Binte Alam");
		driver.findElement(By.id("sign-password")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(7000);
		
		driver.switchTo().alert().accept(); //accept means ok; //for accepting pop up we need to write this code
		
		Thread.sleep(3000);
		driver.close();
	}
}
