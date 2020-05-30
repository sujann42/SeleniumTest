package com.sel_one;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreatingNewFacebookAccount {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 driver.findElement(By.name("firstname")).sendKeys("Hari Kumar");
		 Thread.sleep(2000);
		 driver.findElement(By.name("lastname")).sendKeys("Thapa");
		 Thread.sleep(2000);
		 driver.findElement(By.name("reg_email__")).sendKeys("2149580211");
		 Thread.sleep(2000);
		 driver.findElement(By.name("reg_passwd__")).sendKeys("2149580211");
		 Thread.sleep(2000);
		 Select month = new Select(driver.findElement(By.name("birthday_month")));
		 month.selectByVisibleText("Jan");
		 Thread.sleep(2000);
		 Select day = new Select(driver.findElement(By.name("birthday_day")));
		 day.selectByVisibleText("1");
		 Thread.sleep(2000);
		 Select year = new Select(driver.findElement(By.name("birthday_year")));
		 year.selectByVisibleText("1972");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[contains(text(), 'Male')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("websubmit")).click();		 
		 Thread.sleep(10000);
				
	}

}
