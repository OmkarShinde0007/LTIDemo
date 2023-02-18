package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void dbConnection() {
		System.out.println("Before Test");
		
	}
	@BeforeClass
	public void browerConfid() {
		System.out.println("Before Class: Browser Configuration");
		
	}
	@BeforeMethod
	public void launchApplication() {
		System.out.println("Before Method: Launching Application");
	}
	@Test
	
	public void validateLoginFeature() {
		
		System.out.println("Validate web Login Feature");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		
	}
	@AfterTest
	public void closedbConnection() {
		System.out.println("After Test");
	}
	@AfterClass
	public void closebrowserConfig() {
		System.out.println("After Class: Browser Configuration");
		
	}
	@AfterMethod
	public void closeApplication() {
		System.out.println("After Method: Launching Application");
		
		
	}
	@BeforeSuite
	public void initialization() {
		System.out.println("Before Suite");
		
	}
	@Test
	public void validateTitle() {
		System.out.println("validate Title");
	}
	
	
		
	}


