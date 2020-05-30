package com.sel_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingToFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("Driver: "+url+" Url: "+title);
		driver.findElement(By.id("email")).sendKeys("sujann42@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("Kalibindu@1684");
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
