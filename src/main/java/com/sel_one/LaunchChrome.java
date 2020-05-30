package com.sel_one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		createAndRunChromeDriver();
	}
	public static void createAndRunChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/************/CHROME_DRIVER/chromedriver");
		WebDriver driver = new ChromeDriver();
	}

}
