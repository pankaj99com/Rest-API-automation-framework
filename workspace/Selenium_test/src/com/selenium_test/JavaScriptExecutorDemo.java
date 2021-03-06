package com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='pankaj99.com@gmail.com'");
		js.executeScript("document.getElementById('enterimg').click()");
		Thread.sleep(5000);////input[@placeholder='First Name']
		
		js.executeScript("document.querySelector(\"input[placehoder='First Name']\").value='pankaj'");
		Thread.sleep(5000);
		js.executeScript("history.go(0)");
		WebElement x=driver.findElement(By.xpath("//form[@id='basicBootstrapForm']"));
		js.executeScript("arguments[0].scrollIntoView(true);",x);
		
	}

}
