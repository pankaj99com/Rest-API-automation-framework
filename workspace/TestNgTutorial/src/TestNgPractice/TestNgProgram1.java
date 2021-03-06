package TestNgPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Pankaj.Kumar
 *
 */
public class TestNgProgram1 {
	@BeforeSuite
	public void setup() {
		System.out.println("setup");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("enter url");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void logotest() {
		System.out.println("Logo test");
	}
	@Test
	public void captureScreen() {
		System.out.println("capture screen");
	}
}

