package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication3 {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.id(""));
		username.sendKeys("Omkar");
		driver.findElement(By.name("")).sendKeys("TestPassword");
		
		driver.findElement(By.name("login")).click();
		
		
		
	}
	
	

}
