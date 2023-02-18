package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class LaunchingApplication {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Omkar");
		driver.findElement(By.name("pass")).sendKeys("TestPassword");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
