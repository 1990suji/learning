package com_signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends Login {

	
	public AddressPage()  {
		
		PageFactory.initElements(driver, this);
		
		Login.driver.findElement(By.linkText("Sample test")).click();
		Login.driver.findElement(By.linkText("My addresses")).click();
		Login.driver.findElement(By.xpath("//*[contains(text(),'Add a new address')]")).click();
		Login.driver.findElement(By.id("address1")).sendKeys("test1");
		Login.driver.findElement(By.id("address2")).sendKeys("test2");
		Login.driver.findElement(By.id("city")).sendKeys("test2");
		Login.driver.findElement(By.id("postcode")).sendKeys("23456");
		Login.driver.findElement(By.id("phone")).sendKeys("2345678901");
		Login.driver.findElement(By.id("phone_mobile")).sendKeys("2345678901");
		Login.driver.findElement(By.id("submitAddress")).submit();
				
		
		
	}
	
}
