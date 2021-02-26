package com_signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static WebDriver driver;
	
	
	 
      
public static  WebDriver Login(WebDriver driver)
		{
 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");    
       
  driver=new ChromeDriver();  
 return driver;
   
		}
		
		public static void main(String[] args) {
			Login(driver);
 driver.navigate().to("http://automationpractice.com/index.php");  
   
  //Maximize the browser  
   driver.manage().window().maximize();  
   driver.findElement(By.linkText("Sign in")).click();
   driver.findElement(By.id("email")).sendKeys("1990sujith@gmail.com");
   driver.findElement(By.id("passwd")).sendKeys("Qwerty@123");
   driver.findElement(By.id("SubmitLogin")).click();

}
}
