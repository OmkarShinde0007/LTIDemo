package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XMLParameters {
	@Parameters({"username", "password"})
	@Test
	public void validateLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("TestUsername");
		driver.findElement(By.id("pass")).sendKeys("TestUsername");
		driver.findElement(By.name("login")).click();
		
	  
		
	}
	
	}


