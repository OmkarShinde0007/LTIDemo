package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("Omkar");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("TestPassword");
		
		driver.findElement(By.partialLinkText("Forgotten pass")).click();
	}

}
