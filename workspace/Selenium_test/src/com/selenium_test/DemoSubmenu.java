package com.selenium_test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSubmenu {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.espn.in/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Set<String> winds=driver.getWindowHandles();
		Iterator<String> iterate =winds.iterator();
		
		String mainwindow=iterate.next();
		driver.switchTo().frame("google_ads_iframe_/6444/espn.in/frontpage/index_1");
		
	driver.switchTo().window(mainwindow);
		
		String main_menu="//a[@name='&lpos=sitenavdefault+sitenav_cricket']//span//span[@class='link-text'][contains(text(),'Cricket')]";
		String sub_menu=" //ul[@class='column-top']//li[@class='team']//a[@name='&lpos=subnav+subnav_cricket_team_india']//span//span[@class='link-text'][contains(text(),'India')]";
		WebElement menu1=driver.findElement(By.xpath(main_menu));
		WebElement menu2=driver.findElement(By.xpath(sub_menu));
		Actions action =new Actions(driver);
		
		action.moveToElement(menu1).perform();
		menu2.click();
		
	}

}
