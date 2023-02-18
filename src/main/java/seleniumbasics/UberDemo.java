package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UberDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.uber.com/v2/?breeze_local_zone=phx6&next_url=https%3A%2F%2Fm.uber.com%2F&state=QD-EdPt979KxhmP_H06oN-yqDHMSYZS8qqf2X3fReJQ%3D");
		driver.findElement(By.id("PHONE_NUMBER_or_EMAIL_ADDRESS")).sendKeys("7558341484");
		driver.findElement(By.id("forward-button")).click();
		
		
		
	}

}
