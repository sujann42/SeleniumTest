package com.sel_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingByLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/************/CHROME_DRIVER/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Learn CSS")).click();
		//driver.findElement(By.partialLinkText("Boots")).click();
		/*
		 * List<WebElement> list = driver.findElements(By.tagName("a"));
		 * System.out.println(list.size()); for (int i = 0; i < list.size(); i++) {
		 * //System.out.println(list.get(i).getText());
		 * if(list.get(i).getText().equals("Learn CSS")) { list.get(i).click(); break; }
		 * }
		 */

	}

}
