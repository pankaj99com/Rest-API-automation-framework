package Dropdowndemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium new jar\\firefox new\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Main_Page&action=history");
		
		WebElement Drop_Down=driver.findElement(By.xpath(".//*[@id='month']"));
		Select select=new Select(Drop_Down);
		select.selectByIndex(10);
	 Thread.sleep(3000);
	 select.selectByVisibleText("May");
	 
	 WebElement firstselected=select.getFirstSelectedOption();
	 System.out.println("first selected is "+firstselected.getText());
	 select.selectByIndex(3);
	 
		List<WebElement> li= select.getOptions();
		int actual_size=li.size();
		System.out.println("size is " +actual_size);
		for(int i=0;i<actual_size;i++)
		{
			WebElement w=li.get(i);
			w.getText();
			System.out.println(w.getText());
		//for(WebElement w:li){
			//String month_name=w.getText();
			//System.out.println(month_name);
		}
	}

}
